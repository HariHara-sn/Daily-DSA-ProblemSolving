public class ValidParentheses {
    public static boolean isOpen(char ch) {
        return (ch == '(' || ch == '[' || ch == '{') ? true : false;
    }

    public static boolean isValid(char[] arr, int idx, char currChr) {
        if (currChr == ')' && arr[idx] == '(')
            return true;
        else if (currChr == ']' && arr[idx] == '[')
            return true;
        else if (currChr == '}' && arr[idx] == '{')
            return true;
        return false;

    }

    public static void main(String[] args) {
        String str = "[";

        char[] arr = new char[str.length()];
        int idx = -1;
        for (int i = 0; i < str.length(); i++) {
            char currChr = str.charAt(i);
            if (isOpen(currChr)) {
                arr[++idx] = currChr;
            }
            else if(isValid(arr, idx, currChr)){
                idx--;
            }
            else {
                System.out.println(false);
                return;
            }
        }
        System.out.println(idx == -1);
    }
}
