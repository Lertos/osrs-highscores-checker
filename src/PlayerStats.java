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
            sb.append(columns[0].replace(" - Rank", "") + "\n\t");

            if (isUnranked(columns))
                sb.append("Unranked");
            else {
                int descSize = descriptors.size();

                for (int i = 0; i < descSize; i++) {
                    if (i == descSize-1)
                        sb.append(descriptors.get(i) + String.format("%,d", Integer.parseInt(columns[i + 1])));
                    else
                        sb.append(descriptors.get(i) + String.format("%,d", Integer.parseInt(columns[i + 1])) + ", ");
                }
            }
            System.out.println(sb.toString());
        }
        System.out.println();
    }

    private boolean isUnranked(String[] columns) {
        for (String column : columns) {
            if (column.equalsIgnoreCase("-1"))
                return true;
        }
        return false;
    }

}
