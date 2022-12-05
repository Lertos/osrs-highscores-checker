import java.util.ArrayList;
import java.util.List;

public class PlayerBosses extends PlayerStats {

    private final List<String> descriptors;

     public PlayerBosses (List<String> information) {
         super(information);

         descriptors = new ArrayList<>();

         descriptors.add("Rank: ");
         descriptors.add("Kills: ");
     }

    public void showRowFull() {
        super.showRowFull(descriptors);
    }
}
