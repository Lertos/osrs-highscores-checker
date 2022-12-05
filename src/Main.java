import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String response = "";

        while (!response.equalsIgnoreCase("quit")) {
            System.out.println("\nPlease enter the name of the player you want to check");
            response = scanner.nextLine();

            //Check for the exit response
            if (response.equalsIgnoreCase("quit"))
                continue;

            //Get the information from the API based on the player name given
            List<String> information = Main.getHighscores(response);

            if (information == null)
                continue;

            Player player = new Player(information, response);
            Menu menu = new Menu(player);

            menu.mainMenu();
        }
    }

    public static List<String> getHighscores(String playerName) {
        List<String> lines = new ArrayList<>();

        //Making sure to change spaces to the unicode equivalent
        playerName.replace(" ", "%20");

        //Make the request to the OSRS API
        try {
            URL url = new URL("https://secure.runescape.com/m=hiscore_oldschool/index_lite.ws?player=" + playerName);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.setRequestProperty("User-Agent", "osrs-leaderboard-pinger");
            connection.setReadTimeout(20000);

            int responseCode = connection.getResponseCode();

            //Check if the connection was successful
            if(responseCode != 200) {
                if(responseCode == 404) {
                    System.out.println("That name was not found in the highscore list");
                } else {
                    System.out.println("There was an error connecting to the API");
                }
                return null;
            }

            connection.connect();

            BufferedReader inputReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line = "";

            while((line = inputReader.readLine()) != null) {
                lines.add(line);
            }
            inputReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}