import java.util.ArrayList;
import java.util.List;

public class PlayerSkills extends PlayerStats {

    private final List<String> descriptors;

    public PlayerSkills (List<String> information, int dataColumns) {
        super(information, dataColumns);

        descriptors = new ArrayList<>();

        descriptors.add("Rank: ");
        descriptors.add("Level: ");
        descriptors.add("XP: ");
    }

    public void showRowFull() {
        super.showRowFull(descriptors);
    }
}
