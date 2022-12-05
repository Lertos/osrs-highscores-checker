import java.util.List;

public class PlayerStats {

    List<String> information;
    int dataColumns;

    public PlayerStats(List<String> information, int dataColumns) {
        this.information = information;
        this.dataColumns = dataColumns;
    }

    public void showRowDescriptor() {
        for (String row : information) {
            String[] columns = row.split(",");
            System.out.println(columns[0]);
        }
    }
}
