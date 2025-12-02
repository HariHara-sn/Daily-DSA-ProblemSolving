public class LengthOfLastWord {
     public static void myApproach() {
        String str = "   Hari Hara Sudhan  ";
		int count = 0;
		int lastwordLen = 0;
		for(int i = 0; i < str.length(); i++) {
		    if(str.charAt(i) != ' ') {
		        count++;
                lastwordLen = count;
		    }
		    else {
		        count = 0;
		    }
		}
		System.out.println(lastwordLen);
    }
    public static void main(String[] args) {
        myApproach();
    }
}
