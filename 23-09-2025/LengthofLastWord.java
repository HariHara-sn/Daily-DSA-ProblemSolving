package Day9;
public class LengthofLastWord {
    public static void main(String[] args) {
        String s = "hello world";
        
        // int count=0;
        // s=s.trim();
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)==' '){
        //         count=0;
        //     }
        //     else{
        //         count++;
        //     }
        // }
        // return count; 

        String word[] = s.split(" ");
        int k = word[word.length -1].length();
        System.out.println(k);
    }
}
