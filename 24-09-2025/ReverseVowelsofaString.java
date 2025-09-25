package Day10;

public class ReverseVowelsofaString {
    class Solution {
    public String reverseVowels(String s) {
        
        int k =0;
        String s1="";
        String vowels = "aeiouAEIOU";
        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            if(vowels.contains(String.valueOf(ch))){
                s1+=ch;
            }
        }


        int j=0;
        String s2="";
        for(int i=0;i<s.length();i++){
            if(vowels.contains(String.valueOf(s.charAt(i)))){
                char ch = s1.charAt(j);
                s2+=ch;
                j++;
            }
            else{
                s2+=s.charAt(i);
            }

        }
        return s2;

    }
}
}
