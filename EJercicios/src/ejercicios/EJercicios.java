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
//        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
//        BufferedReader reader = new BufferedReader(inputStreamReader);
//
//        System.out.println("Ingrese el primer numero:");
//        String strNum = reader.readLine();
//        int numUno = Integer.parseInt(strNum);
//
//        System.out.println("Ingrese el segundo numero:");
//        String strNumD = reader.readLine();
//        int numDos = Integer.parseInt(strNumD);
//
//        System.out.println("Ingrese el tercer numero:");
//        String strNumT = reader.readLine();
//        int numTres = Integer.parseInt(strNumT);
//
//        Integer mayor = numUno;
//
//        if (numDos > mayor) {
//            mayor = numDos;
//
//        }
//        if (numTres > mayor) {
//            mayor = numTres;
//
//        }
//        System.out.println("El numero mayor es: " + mayor);
//        
//        
//        
//        Integer numeroMenor = numUno;
//
//        if (numDos < numeroMenor) {
//            mayor = numDos;
//
//        }
//        if (numTres < numeroMenor) {
//            mayor = numTres;
//
//        }
//        System.out.println("El numero menor es: " + numeroMenor);

        /* 
            Armar un programa que permita cargar 3 numeros y mostrar
            cual es el numero promedio.
            Ejemplo: si cargo 2, 6 y 9, el promedio es 5.66
         */
        
        System.out.println("Ingrese el primer numero:");
        int numUno = cargarNumero();

        System.out.println("Ingrese el segundo numero:");
        int numDos = cargarNumero();

        System.out.println("Ingrese el tercer numero:");
        int numTres = cargarNumero();

        calcularPromedio(numUno, numDos, numTres);
        parImpar(numUno);
    }

    private static Integer cargarNumero() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        String strNum = reader.readLine();
        int num = Integer.parseInt(strNum);

        return num;
    }

    /**
     * Esta funcion sirve para calcular el promedio de tres numeros
     *
     * @param numUno Es el primer numero
     * @param numDos Es el segundo numero
     * @param numTres Es el tercer numero
     */
    private static void calcularPromedio(int numUno, int numDos, int numTres) {
        int sumatoria = numUno + numDos + numTres;
        double promedio = Double.valueOf(sumatoria) / 3;
        System.out.println("El promedio de los tres numeros es: " + promedio);

    }
    
    /*
    Armar un programa que permita ingresar un nùmero y mostrar si es par o impar
    */
    
    /**
     * esta funcion nos permite mostrar si un numero es par o impar
     * @param numUno es el unico parametro que recibe
     */
    private static void parImpar(int numUno){
       boolean parOImapar = numUno % 2 == 0;
       
       if(parOImapar){
           System.out.println("El numero " + numUno + " es par");
       }else{
           System.out.println("El numero " + numUno + " es impar");
       }
           
           
    }
}
