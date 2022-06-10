import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        // Streams / Lambda

        // creamos un array llamado cities
        List<String> cities = new ArrayList<>();

        // De esta forma es como agregamos datos a nuestro array
        cities.add("Londo");
        cities.add("Bogota");
        cities.add("Buenos Aires");
        cities.add("New York");
        cities.add("Lima");
        cities.add("Tokio");

        /*
        *  Se inicializa un indice i en 0,
        *  en la iteracion i debe ser menor al tamaño del array cities,
        *  cada vez que se cumpla con la iteracion el indice i +1
        * */

       // para poder mostrar esos datos en el array cities en consola, se debe iterar
       // forma No. 1 de como mostrar

        /*
        for (int i = 0; i < cities.size(); i++){
        System.out.println(cities.get(i));
        }


        // forma No. 2 de como mostrar
        for (String city : cities){
            System.out.println(city);
        }
*/
        // forma No. 3 de como mostrar

        /*
        *  En esta tercera forma podemos ver el uso de stream,
        * el uso de exprexiones lambda y el praton de diseño
        * pathline. linea 48
        *
        * La flecha -> es la que divide la expresion lamda,
        *  en la parte de la izquierda recibe los argumentos y lo guarda en una variable,
        *  y en la parte derecha muestra el cuerpo de la funcion
        * para este caso no se declaro la variable con tipo String y no se utilizaron llaves.
        * */

        cities.stream().forEach(city -> System.out.println(city));

        System.out.println("hello world");
    }

        /* Las exprenciones lambda lo que nos permite es reducir
        * una funcion (Lineas 57 - 59) lo mas simple posible en una linea de codigo
        * (linea 48)
        * */

    public static  void printCity(String city){
        System.out.println(city);
    }
}
