public class RemoveVoweleStr {
    public boolean isVowel(char c) {
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
            default:
                return false;
        }
    }

    public String reverseVowels(String s) {
        char[] charList = s.toCharArray();
        int left = 0, right = charList.length - 1;
        while (left < right) {
            if (isVowel(charList[left]) && isVowel(charList[right])) {
                // a = a + b - (b = a); SWAP
                charList[left] = (char) ((char) (charList[left] + charList[right]) - (char) (charList[right] = charList[left]));
                left++;
                right--;
            }
            if (!isVowel(charList[left]))
                left++;
            if (!isVowel(charList[right]))
                right--;
        }
        return new String(charList);

    }

    public static void main(String[] args) {

    }
}
