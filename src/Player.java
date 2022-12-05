import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Player {

    private List<String> highscoreMappings;

    private PlayerSkills playerSkills;
    private PlayerActivities playerActivities;
    private PlayerClues playerClues;
    private PlayerBosses playerBosses;

    public Player(List<String> information) {
        highscoreMappings = new ArrayList<>();

        if (setupHighscoreMappings() == false)
            return;

        createPlayerLists(information);
    }

    private boolean setupHighscoreMappings() {
        try (BufferedReader file = new BufferedReader(new FileReader("resources/HighscoreMappings.txt"))) {
            String input;

            while ((input = file.readLine()) != null) {
                highscoreMappings.add(input);
            }
        } catch (IOException e) {
            System.out.println("The file could not be read");
            return false;
        }
        return true;
    }

    private boolean createPlayerLists(List<String> information) {
        //Checks to make sure the mappings and the API are sending the same amount; otherwise there could be incorrect data showing
        if (information.size() != highscoreMappings.size()) {
            System.out.println("ERROR: The mappings and the API are different sizes");
            return false;
        }

        List<String> playerSkillsList = new ArrayList<>();
        List<String> playerActivitiesList = new ArrayList<>();
        List<String> playerCluesList = new ArrayList<>();
        List<String> playerBossesList = new ArrayList<>();

        //Get each type in their respective lists
        for (String line : information) {
            String category = line.substring(0, 2);
            String stringToAdd = line.substring(1);

            //Check the category given by the substring of the first two characters of each line
            if (category.equalsIgnoreCase("s,"))
                playerSkillsList.add(stringToAdd);
            else if (category.equalsIgnoreCase("a,"))
                playerActivitiesList.add(stringToAdd);
            else if (category.equalsIgnoreCase("c,"))
                playerCluesList.add(stringToAdd);
            else if (category.equalsIgnoreCase("b,"))
                playerBossesList.add(stringToAdd);
        }

        //Setup each Player object
        return true;
    }

}
