import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        scan.nextLine();
        String[] arr = new String[size];
        for (int i = 0; i < size; i++) {
            String str = scan.nextLine();
            arr[i] = str;
        }
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            if(arr[i].length() > 10){
                int num = arr[i].length() - 2;
                int first = 0;
                int last = arr[i].length() - 1;
                word = arr[i].charAt(first)+""+num+arr[i].charAt(last);
            }
            System.out.println(word);
        }
        scan.close();
    }
}
