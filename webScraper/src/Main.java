import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        // Donwload webs

        String link = "https://platzi.com/";
        URL url = new URL(link);
        HttpURLConnection coon = (HttpURLConnection) url.openConnection();
        String encoding = coon.getContentEncoding();

        InputStream input = coon.getInputStream();
        String result = new BufferedReader(new InputStreamReader(input)).
                lines().collect(Collectors.joining());
        System.out.println(result);

    }
}
