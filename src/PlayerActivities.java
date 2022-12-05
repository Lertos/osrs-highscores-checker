import java.util.ArrayList;
import java.util.List;

public class PlayerActivities extends PlayerStats {

    private final List<String> descriptors;

    public PlayerActivities (List<String> information, int dataColumns) {
        super(information, dataColumns);

        descriptors = new ArrayList<>();

        descriptors.add("Rank: ");
        descriptors.add("Score: ");
    }

    public void showRowFull() {
        super.showRowFull(descriptors);
    }
}
