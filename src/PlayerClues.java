import java.util.ArrayList;
import java.util.List;

public class PlayerClues extends PlayerStats {

    private final List<String> descriptors;

    public PlayerClues (List<String> information, int dataColumns) {
        super(information, dataColumns);

        descriptors = new ArrayList<>();

        descriptors.add("Rank: ");
        descriptors.add("Completed: ");
    }

    public void showRowFull() {
        super.showRowFull(descriptors);
    }
}
