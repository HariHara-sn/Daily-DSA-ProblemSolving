//ctrl + ` = focus terminal
// Delete Columns to Make Sorted
public class Main {

    public static void main(String[] args) {
        String[] strs = { "cba", "daf", "ghi" };
        // 944. Delete Columns to Make Sorted - submit it on tomorrow
        int row = strs.length;
        int col = strs[0].length();
        int delCount = 0;
        for (int i = 0; i < col; i++) {
            for (int j = 1; j < row; j++) {
                System.out.println(strs[j - 1].charAt(i) + " " + strs[j].charAt(i));
                if (!(strs[j - 1].charAt(i) < strs[j].charAt(i))) {
                    delCount++;
                    System.out.println(strs[j - 1].charAt(i));
                    break;
                }
            }
        }
        System.out.println(delCount);

    }
}