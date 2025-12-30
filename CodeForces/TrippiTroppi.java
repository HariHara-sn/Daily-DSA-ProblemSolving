import java.util.Scanner;

public class TrippiTroppi {
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
            for (String e : word.split(" ")) {
                System.out.print(e.charAt(0));
            }
            System.out.println();
        }
        scan.close();
    }
}
