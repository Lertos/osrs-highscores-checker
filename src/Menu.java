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

        while(!response.equalsIgnoreCase("6")) {
            System.out.println("\nCURRENT PLAYER: " + player.getPlayerName() + ". Please pick an option from below to see their info");
            System.out.println("1 - See the players' COMBINED information");
            System.out.println("2 - See the players' SKILLS information");
            System.out.println("3 - See the players' ACTIVITY information");
            System.out.println("4 - See the players' CLUE information");
            System.out.println("5 - See the players' BOSS information");
            System.out.println("6 - Pick another player to view information about");

            response = scanner.nextLine();

            switch(response) {
                case "1" -> player.showCombinedStats();
                case "2" -> player.showPlayerSkills();
                case "3" -> player.showPlayerActivities();
                case "4" -> player.showPlayerClues();
                case "5" -> player.showPlayerBosses();
                case "6" -> System.out.println("Returning to the player picking process");
                default -> System.out.println("That was not a valid option - please pick again.");
            }
        }
    }
}
