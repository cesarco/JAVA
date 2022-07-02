import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;

public class Main {

    public static void main(String[] args){
        //DATE
        Calendar c = Calendar.getInstance();
        c.set(2022, Calendar.JANUARY,1);
        String something = "Hello world";
        LocalDate date = LocalDate.of(2022, Month.JANUARY,1);

        // TIMES
        LocalTime time = LocalTime.of(10,0);

        // DateTime
        LocalDateTime dt = LocalDateTime.of(date,time);

        LocalDateTime dt2 = LocalDateTime.of(2022, 1,1, 10,1);
    // localdatetime maneja dos objetos, el objeto time y el objetos date por separador
    }
}
