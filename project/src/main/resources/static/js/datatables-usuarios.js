// Call the dataTables jQuery plugin
$(document).ready(function() {

  cargarUsuarios();

  $('#usuarios').DataTable();

  actualizarEmailUsuario();
});

function actualizarEmailUsuario(){
    document.getElementById("txt-email-usuario").outerHTML = localStorage.email;
}
async function cargarUsuarios(){

        const rawResponse = await fetch('api/usuarios', {
            method: 'GET',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json',
                'Authorization': localStorage.token
            },
        });
        const content = await rawResponse.json();
        let listadoHtml = '';


for(let usuario of content){
    let botonEliminar = '<a href="#" onclick= "eliminarUsuario(' + usuario.id + ')" class="btn btn-danger btn-circle btn-sm"> <i class="fas fa-trash"></i></a>';
    let telefonoTexto = usuario.telefono == null ? '-' : usuario.telefono;
    let usuarioHtml = '  <tr>\n' +
        '         <td>'+ usuario.id +'</td>\n' +
        '         <td>'+ usuario.nombre+' '+ usuario.apellido +'</td>\n' +
        '         <td>'+ usuario.email +'</td>\n' +
        '         <td>'+telefonoTexto +'</td>\n' +
        '         <td>' + usuario.password +'</td>\n' +
        '         <td>'+ botonEliminar +'</td>\n' +
        '\n' +
        '         </tr>';
    listadoHtml += usuarioHtml;
}
    document.querySelector('#usuarios tbody').outerHTML =listadoHtml;

}

function getHeaders() {
    return {
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': localStorage.token

        }
    };
}

async function eliminarUsuario(id){

    if(!confirm('¿Desea eliminar este usuario?')){
        return;
    }
    const rawResponse = await fetch('api/usuarios/' + id, {
        method: 'DELETE',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization' : localStorage.token

        },
    });

    location.reload();
}