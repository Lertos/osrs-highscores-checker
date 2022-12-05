import java.util.ArrayList;
import java.util.List;

public class PlayerActivities extends PlayerStats {

    private final List<String> descriptors;

    public PlayerActivities (List<String> information) {
        super(information);

        descriptors = new ArrayList<>();

        descriptors.add("Rank: ");
        descriptors.add("Score: ");
    }

    public void showRowFull() {
        super.showRowFull(descriptors);
    }
}
