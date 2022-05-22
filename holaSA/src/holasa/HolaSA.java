/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holasa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author cesarco
 */
public class HolaSA {

    public static void main(String[] args) throws IOException {
//                // creando una variable de tipo string
//      String nombre="Cesar Luis";
//      
//      // imprime en la consola, lo que se guardo en la variable
//      System.out.println(nombre);
//      
//      // Formas de concatenar
//      String nombreCompleto = "Cesar Luis" + "Rodriguez Solera";
//      System.out.println("Bienvenido " + nombreCompleto + " Es un gusto verlo");
//      
//      int edad = 19;
//      System.out.println(edad);
//
//        int edad = 5;
//        boolean esMayorDeEdad = edad >= 18;
//
//        if (esMayorDeEdad) {
//            System.out.println("Es mayor de edad");
//        } else {
//            System.out.println("Es menor de edad");
//        }

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        System.out.println("Ingrese su nombre:");
        String name = reader.readLine();
        System.out.println("Hola " + name);

        System.out.println("");

        System.out.println("Ingrese su edad:");
        String strEdad = reader.readLine();
        int edad = Integer.parseInt(strEdad);
        System.out.println("Hola " + name);

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }

}
