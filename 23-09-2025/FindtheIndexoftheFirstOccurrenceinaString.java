package Day9;
public class FindtheIndexoftheFirstOccurrenceinaString {
    public static void main(String[] args) {
        
        String haystack = "hello";
        String needle = "ll";
        int k=0;
        if(haystack.contains(needle)){
            if(haystack.length()<2){
                    k=0;
            }
            else{
                // for(int i=0;i<haystack.length();i++){
                //     if(haystack.charAt(i)==needle.charAt(0)&&haystack.charAt(i+1)==needle.charAt(1)){
                //         k=i;
                //         break;
                //     }
                // }

                k= haystack.indexOf(needle);
            }
            
        }
        else{
            System.out.println("-1");
        }

        System.out.println(k);
    }
}
