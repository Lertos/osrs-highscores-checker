import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {

        try {
            URL url = new URL("https://secure.runescape.com/m=hiscore_oldschool/index_lite.ws?player=Gim%20Torin");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.setRequestProperty("User-Agent", "osrs-leaderboard-pinger");
            connection.setReadTimeout(5000);

            int responseCode = connection.getResponseCode();

            if(responseCode != 200) {
                System.out.println("There was an error connecting");
            }

            connection.connect();

            BufferedReader inputReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String line = "";

            while((line = inputReader.readLine()) != null) {
                System.out.println(line);
            }
            inputReader.close();

        } catch (MalformedURLException e) {
        } catch (IOException e) {
        }
    }
}