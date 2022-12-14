import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Player {

    private final String playerName;
    private final List<String> highscoreMappings;
    private PlayerSkills playerSkills;
    private PlayerActivities playerActivities;
    private PlayerClues playerClues;
    private PlayerBosses playerBosses;

    public Player(List<String> information, String playerName) {
        this.playerName = playerName;
        this.highscoreMappings = new ArrayList<>();

        if (!setupHighscoreMappings())
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

    private void createPlayerLists(List<String> information) {
        //Checks to make sure the mappings and the API are sending the same amount; otherwise there could be incorrect data showing
        if (information.size() != highscoreMappings.size()) {
            System.out.println("ERROR: The mappings and the API are different sizes");
            return;
        }

        List<String> playerSkillsList = new ArrayList<>();
        List<String> playerActivitiesList = new ArrayList<>();
        List<String> playerCluesList = new ArrayList<>();
        List<String> playerBossesList = new ArrayList<>();

        //Get each type in their respective lists
        for (int i=0; i<information.size(); i++) {
            String category = highscoreMappings.get(i).substring(0, 2);
            String mappingData = highscoreMappings.get(i).substring(2);
            String highscoreData = information.get(i);
            String combinedData = mappingData + "," + highscoreData;

            //Check the category given by the substring of the first two characters of each line
            if (category.equalsIgnoreCase("s,"))
                playerSkillsList.add(combinedData);
            else if (category.equalsIgnoreCase("a,"))
                playerActivitiesList.add(combinedData);
            else if (category.equalsIgnoreCase("c,"))
                playerCluesList.add(combinedData);
            else if (category.equalsIgnoreCase("b,"))
                playerBossesList.add(combinedData);
        }

        //Setup each Player object
        playerSkills = new PlayerSkills(playerSkillsList);
        playerActivities = new PlayerActivities(playerActivitiesList);
        playerClues = new PlayerClues(playerCluesList);
        playerBosses = new PlayerBosses(playerBossesList);
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public void showCombinedStats() {
        playerSkills.showRowFull();
        playerActivities.showRowFull();
        playerClues.showRowFull();
        playerBosses.showRowFull();
    }

    public void showPlayerSkills() {
        playerSkills.showRowFull();
    }

    public void showPlayerActivities() {
        playerActivities.showRowFull();
    }

    public void showPlayerClues() {
        playerClues.showRowFull();
    }

    public void showPlayerBosses() {
        playerBosses.showRowFull();
    }

}
