// 771. Jewels and Stones
public class JewelsStones {
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for(char jch : jewels.toCharArray()) {
            for(char sch : stones.toCharArray()) {
                if(jch == sch) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels,stones));
        

    }

}