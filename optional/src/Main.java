import java.util.Optional;

public class Main {

    public static void main(String[] args){
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