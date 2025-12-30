import java.io.FileWriter;
import java.io.IOException;

public class Main {
    private String input;

    public char[] sortArr(char[] arr) {
        // bubble sort
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    char temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }

    Main(String input) {
        this.input = input;
    }

    public String[] sortCharacters() {
        char[] charArray = input.toCharArray();
        // sort
        // Arrays.sort(charArray);
        sortArr(charArray);
        String[] sortedArr = new String[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            sortedArr[i] = String.valueOf(charArray[i]);
        }
        return sortedArr;
    }

    public void writeToFile(String filename, String[] sortedArr) {
        try (FileWriter writer = new FileWriter(filename)) {
            for (String s : sortedArr) {
                writer.write(s + " ");
            }
            System.out.println("success: " + filename);
        } catch (IOException e) {
        }
    }

    public static void main(String[] args) {
        String input = "HariHaraSudhan";
        System.out.println("Input: " + input);
        Main sorter = new Main(input);

        String[] sortedArray = sorter.sortCharacters();
        sorter.writeToFile("sorted_output.txt", sortedArray);

    }
}
