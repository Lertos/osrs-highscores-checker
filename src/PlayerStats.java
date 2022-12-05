import java.util.List;

public class PlayerStats {

    private final List<String> information;
    private final int dataColumns;

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

    public void showRowFull(List<String> descriptors) {
        for (String row : information) {
            StringBuilder sb = new StringBuilder();
            String[] columns = row.split(",");

            if (descriptors.size() != columns.length - 1) {
                System.out.println("ERROR: Descriptors and row data are not the same length");
                return;
            }

            //The replace is because some headers have the word "rank" in them, but we already specify it
            sb.append(columns[0].replace(" - Rank", "") + " = ");

            for (int i=0; i<descriptors.size(); i++)
                sb.append(descriptors.get(i) + columns[i+1] + " ");

            System.out.println(sb.toString());
        }
        System.out.println();
    }
}
