public class Spreadsheet {
    static int column_num(String str) {
        int num = 0;
        for (char e : str.toCharArray()) {
            num = num * 26 + (e - 'A' + 1);
        }
        return num;
    }

    static String column_name(int num) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            num--; 
            int rem = num % 26;
            sb.append((char) ('A' + rem));
            num = num / 26;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        // String input = "R23C55";
        String input = "BC23";

        if (input.charAt(0) != 'R') {
            int split = 0;
            while (Character.isLetter(input.charAt(split))) split++;
            String letters = input.substring(0, split);
            String row = input.substring(split);
            System.out.println("R" + row + "C" + column_num(letters));
        } else {
            int cPos = input.indexOf('C');
            int row = Integer.parseInt(input.substring(1, cPos));
            int col = Integer.parseInt(input.substring(cPos + 1));
            System.out.println(column_name(col) + row);
        }
    }
}
