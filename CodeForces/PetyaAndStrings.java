import java.util.Scanner;

public class PetyaAndStrings {
    public static int petyaString(String first, String second){

        for (int i = 0; i < first.length(); i++) {
            char h1 = first.charAt(i);
            char h2 = second.charAt(i); 
            if (h1 != h2) {
                if(h1 < h2){
                    return -1;
                }
                else {
                    return 1;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String first = scan.nextLine().toLowerCase();
        String second = scan.nextLine().toLowerCase();
        
        System.out.println(petyaString(first,second));
        scan.close();
        
    }
}
