public class MultiplyStrings {
    // 43. Multiply Strings - The below code passes over 128 / 311 testcases passed
    public static int strToint(String str) {
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            res = (res * 10) + str.charAt(i) - '0';
        }
        return res;
    }

    public static String intTostr(int num) {

        StringBuilder sb = new StringBuilder();
        if(num == 0) return "0";
        while (num > 0) {
            sb.append(num % 10);
            num /= 10;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String str1 = "0";
        String str2 = "0";

        int res = strToint(str1) * strToint(str2);
        System.out.println("Integer: " + res);
        String strRes = intTostr(res);
        System.out.println("String: " + strRes);

    }
}
