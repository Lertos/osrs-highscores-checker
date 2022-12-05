import java.util.ArrayList;
import java.util.List;

public class PlayerClues extends PlayerStats {

    private final List<String> descriptors;

    public PlayerClues (List<String> information) {
        super(information);

        descriptors = new ArrayList<>();

        descriptors.add("Rank: ");
        descriptors.add("Completed: ");
    }

    public void showRowFull() {
        super.showRowFull(descriptors);
    }
}
