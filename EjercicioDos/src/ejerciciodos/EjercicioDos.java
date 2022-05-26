/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciodos;

/**
 *
 * @author cesarco
 */
public class EjercicioDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String resultado = "";
        int numero = 1;
        int contador = 0;
        while (contador < 100) {
            if (esPrimo(numero)) {
                resultado += contador + ", ";
                contador++;

            }
            numero++;
        }
        System.out.println("Los primeros 100 numeros primos son: " + resultado);
    }

    private static Boolean esPrimo(int numero) {
        Boolean esUnNumeroPrimo = true;

        for (int i = 2; i < numero; i++) {

            if (numero % i == 0) {
                esUnNumeroPrimo = false;
            }
        }
        return esUnNumeroPrimo;
    }
}
