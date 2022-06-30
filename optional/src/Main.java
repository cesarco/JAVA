public class Main {

    public static void main(String[] args){
        Double result = averageScores();
    }
    public static Double averageScores(Double ...scores){
        if(scores.length == 0){
            return null;
        }
        double sum = 0;
        for (Double score : scores) sum += score;
        return sum / scores.length;
    }
}
/*
se usa optional para tener un mejor control para el manejo de errores como nullpointerexception
es una alternativa para el uso de los NULL
 */