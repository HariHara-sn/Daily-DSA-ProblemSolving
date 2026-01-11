// 459. Repeated Substring Pattern
public class RepeatedSubstringPattern {
    
    public static void main(String[] args) {
        String s = "ababab";
        String ss = s + s;
        String sub = ss.substring(1, ss.length() - 1);
        System.out.println(ss);
        System.out.println(sub);
        
        System.out.println(sub.contains(s));
        
    }
}
