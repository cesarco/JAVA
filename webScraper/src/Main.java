import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args)  {
        // Donwload webs

            List<String> links = new ArrayList<>();
            links.add("https://platzi.com/");
            links.add("https://platzi.com/clases/1050-programacion-basica/5103-mi-primera-linea-de-codigo/");
            links.add("https://platzi.com/categorias/negocios/");
            links.add("https://platzi.com/categorias/desarrollo/");

        links.stream().parallel().forEach(link -> getWebContent(link));


            String link = "https://platzi.com/";
            String result = getWebContent(link);



    }
    private synchronized static String getWebContent(String link){
        System.out.println("INIT");
        System.out.println(link);

        try{
            URL url = new URL(link);
            HttpURLConnection coon = (HttpURLConnection) url.openConnection();
            String encoding = coon.getContentEncoding();

            InputStream input = coon.getInputStream();
            Stream<String> lines = new BufferedReader(new InputStreamReader(input)).lines();
/*
            List<String> array = new ArrayList<>();
            array.add("<html>");
            array.add("<head>");
            array.add("<title>");
            array.forEach(line -> System.out.println(line));
*/
            System.out.println("END");

            saveInDatabase(result);
            return lines.collect(Collectors.joining());


        }catch (IOException e){
            System.out.println(e.getMessage());
        }


        return "";
    }

    public static void saveInDatabase(String x){

    }

}
