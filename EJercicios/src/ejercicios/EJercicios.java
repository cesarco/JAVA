/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author cesarco
 */
public class EJercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        /*  
        Armar un programa que permita cargar 3 nùmeros y mostrar
        cual es el mayor y cual es el menor
         */
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        System.out.println("Ingrese el primer numero:");
        String strNum = reader.readLine();
        int numUno = Integer.parseInt(strNum);

        System.out.println("Ingrese el segundo numero:");
        String strNumD = reader.readLine();
        int numDos = Integer.parseInt(strNumD);

        System.out.println("Ingrese el tercer numero:");
        String strNumT = reader.readLine();
        int numTres = Integer.parseInt(strNumT);

        Integer mayor = numUno;

        if (numDos > mayor) {
            mayor = numDos;

        }
        if (numTres > mayor) {
            mayor = numTres;

        }
        System.out.println("El numero mayor es: " + mayor);
        
        
        
        Integer numeroMenor = numUno;

        if (numDos < numeroMenor) {
            mayor = numDos;

        }
        if (numTres < numeroMenor) {
            mayor = numTres;

        }
        System.out.println("El numero menor es: " + numeroMenor);

    }
}
