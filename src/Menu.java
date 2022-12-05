import java.util.Scanner;

public class Menu {

    private final Player player;
    private final Scanner scanner;

    public Menu(Player player) {
        this.player = player;
        this.scanner = new Scanner(System.in);
    }

    public void mainMenu() {
        String response = "";

        while(!response.equalsIgnoreCase("back")) {
            System.out.println("\nCURRENT PLAYER: " + player.getPlayerName() + ". Please pick an option from below to see their info");
            System.out.println("1 - See the players' entire highscore information");
            System.out.println("2 - See the players' SKILLS information");
            System.out.println("3 - See the players' ACTIVITY information");
            System.out.println("4 - See the players' CLUE information");
            System.out.println("5 - See the players' BOSS information");
            System.out.println("6 - Pick another player to view information about");

        }
    }

    private void playerSkillsMenu() {

    }

    private void playerActivitiesMenu() {

    }

    private void playerCluesMenu() {

    }

    private void playerBossesMenu() {

    }

}
