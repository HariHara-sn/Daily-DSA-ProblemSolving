package Day9;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        int result=0;
        for(int i=0;i<columnTitle.length();i++){
            char c = columnTitle.charAt(i);
            int value = c - 'A' + 1;
            result = result*26+value;
        }
        
        return result;
        

    }
}
