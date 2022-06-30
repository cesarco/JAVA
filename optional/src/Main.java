import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args){

        List<String> countries = new ArrayList<>();
        countries.add("United States");
        countries.add("Argentina");
        countries.add("Spain");
        countries.add("Italy");
        countries.add("Colombia");
        countries.add("Mexico");
        countries.add("Ecuador");
        countries.add("Peru");

    Optional<String> country = countries.stream()
            .filter(c -> c.startsWith("Arg")).findFirst();
    //findFirst -> devuelve el primer resultado, pero envuelto en un optinal

       // if(country.isPresent()) System.out.println(country.get());
        country.ifPresent(System.out::println);

    }

    public static void exampleOptional(){
        Optional<Double> result = averageScores(7.0, 8.0, 4.0,10.0);
        if(result.isPresent()){
            System.out.println(result.get()); // de esta forma nos permite obtener el valor que esta dentro de optional
        }else {
            System.out.println("Nothing");
        }
    }

    public static Optional<Double> averageScores(Double ...scores){
        if(scores.length == 0){
            return Optional.empty();
        }
        double sum = 0;
        for (Double score : scores) sum += score;
        return Optional.of(sum / scores.length);
    }
}
/*
se usa optional para tener un mejor control para el manejo de errores como nullpointerexception
es una alternativa para el uso de los NULL
Optional lo que nos ayuda es para entender si recibe un numero o un dato o NO, por que nos
indica de que probablemente no nos devuelca un numero-

se utiliza mucho en las expresiones lambda
 */