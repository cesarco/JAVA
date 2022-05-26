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
        
        int numero = 13;
        Boolean esPrimo = true;
        
        for (int i = 2; i < numero; i++) {
           if(numero % i == 0){
               esPrimo = false;
               
           } 
        }
        
        if(esPrimo){
            System.out.println("Es primo");
        }else{
            System.out.println("No es primo");
        }
    }
    
}
