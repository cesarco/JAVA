package com.myprojectjava.project.controllers;
// los controladores nos sirven para manejar el uso de las url.
// aprender Sptring security y control de errores

import com.myprojectjava.project.dao.UsuarioDao;
import com.myprojectjava.project.models.Usuario;
import com.myprojectjava.project.utils.JWTUtil;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;
    @Autowired
    private JWTUtil jwtUtil;


    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.GET)
    public Usuario getUsuario(@PathVariable Long id) {

        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Cesar Luis");
        usuario.setApellido("Rodriguez Solera");
        usuario.setEmail("dev@outlook.es");
        usuario.setTelefono("3024198990");
        usuario.setPassword("cesarlk#$");
        return usuario;
    }

    private boolean validarToken(String token){

        String usuarioId = jwtUtil.getKey(token);
        return usuarioId != null;
    }

    @RequestMapping(value = "api/usuarios", method = RequestMethod.POST)
    public void registrarUsuario(@RequestBody Usuario usuario) {
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        String hash = argon2.hash(1,1024, 1, usuario.getPassword());
        usuario.setPassword(hash);
       usuarioDao.registrar(usuario);

    }

    @RequestMapping(value = "api/usuarios", method = RequestMethod.GET)
    public List<Usuario> getUsuarios(@RequestHeader(value="Authorization") String token) {
        if(!validarToken(token)){
            return null;
        }
        return usuarioDao.getUsuarios();

    }

    @RequestMapping(value = "usuario12")
    public Usuario editar() {

        Usuario usuario = new Usuario();
        usuario.setNombre("Cesar Luis");
        usuario.setApellido("Rodriguez Solera");
        usuario.setEmail("dev@outlook.es");
        usuario.setTelefono("3024198990");
        usuario.setPassword("cesarlk#$");
        return usuario;
    }


    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)
    public void  eliminar(@RequestHeader(value="Authorization") String token, @PathVariable Long id) {
        if(!validarToken(token)){
            return;
        }
    usuarioDao.eliminar(id);

    }
/*
    @RequestMapping(value = "usuario14")
    public Usuario buscar() {


        Usuario usuario = new Usuario();
        usuario.setNombre("Cesar Luis");
        usuario.setApellido("Rodriguez Solera");
        usuario.setEmail("dev@outlook.es");
        usuario.setTelefono("3024198990");
        usuario.setPassword("cesarlk#$");
        return usuario;

    }

 */
}

// xml y json sriven para la comunicacion de servicios
//el metodo https, es metodo mas seguro en internet, es un certificado de seguridad
//el metodo http, no contiene ese certificado
// URL : https://waytolearnx.com/author/anime-kouis.html
// URN : waytolearnx.com/author/anime-kouis.html#posts
// URI : https://waytolearnx.com/author/anime-kouis.html#posts
// el .html se considera la locacion y el posts es el recurso
/*
*¿que son los metodos HTTP?
* GET ---------> Consultar
* POST --------> Crear
* PUT ---------> Modificar
* PATCH -------> Modificar
* DELETE ------> Eliminar
*
* otros: CONNECT, OPTIONS, TRACE, HEAD
*
* ¿QUE ES MVC?
* modelo vista controlador
* es un patron de arquitectura de software que nos ayuda
*  a organizar muchisimo mejor nuestro codigo y para comunicar con el cliente.
* cuando se refiere a cliente es a portatil, pc, movil entre otros
*
* ¿Ques es REST?
* se maneja con json y ajax esa informacion o esas peticiones son asincronicas
* hacia el servidor
*
* */