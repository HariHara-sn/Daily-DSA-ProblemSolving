    package Day9;

    public class ExcelSheetColumnTitle {

        public static void main(String[] args) {
            int columnNumber = 27;

            if(columnNumber>0 && columnNumber<27 ){
                int first = columnNumber + 64;
                char firstchar = (char) first;
                System.out.println(firstchar);
            }
            else{
                while (columnNumber>0) {
                    int d=0;
                    columnNumber--;

                    d = columnNumber % 26;
                    
                    int add = d + 65;
                    char ch = (char) add;

                    System.out.print(ch);

                    // if(columnNumber>0 && columnNumber<27 ){
                    //     break;
                    // }

                    columnNumber = columnNumber / 26;
                }
            }
            
            
        }
    }
