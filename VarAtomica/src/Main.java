import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args)
    {
        String from = "BCN";
        String to = "JFK";

        Double lowestPrice = 0.0;
        Double avgPrice = 0.0;

        Double result = getPriceTrip("Delta Airlines", from, to);
        System.out.println(result);
    }

    private static Double getPriceTrip(String airline, String from, String to){
        Map<String, Double> priceByAirline = new HashMap<>();

        priceByAirline.put("American Airlines", 550.0);
        priceByAirline.put("US Airways", 610.0);
        priceByAirline.put("Delta Airlines", 458.0);
        priceByAirline.put("Qatar Airways", 590.7);
        priceByAirline.put("Cathay Pacific Airways", 540.0);
        priceByAirline.put("Sky Airlines", 600.4);
        priceByAirline.put("Copa Airlines Colombia", 605.0);
        priceByAirline.put("Avianca", 745.2);
        priceByAirline.put("LATAM Airlines Group", 530.6);
        priceByAirline.put("Aeromexico", 740.0);

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return priceByAirline.get(airline);
    }
}
