// public class AandB {
//     // Problem: https://codeforces.com/problemset/problem/2149/D
//     public static int timesOfA(String str) {
//         int count = 0;
//         for (char s : str.toCharArray()) {
//             if(s == 'a') count++;
//         }
//         return count;
//     }

//     public static void main(String[] args) { // find min number of swap
//         String s = "abab";
//         int len = s.length();
//         int num = len / timesOfA(s); // or use mod
//         System.out.println(num);
//     }
// }
public class AandB {
    public static int minMoves(String s, char ch) {
        int n = s.length();
        int[] pos = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ch) {
                pos[count++] = i;
            }
        }

        if (count <= 1) return 0; // already grouped

        int mid = count / 2;
        int median = pos[mid];
        int moves = 0;

        // Calculate total swaps to make them consecutive
        for (int i = 0; i < count; i++) {
            int target = median - mid + i;
            moves += Math.abs(pos[i] - target);
        }

        return moves;
    }

    public static void main(String[] args) {
        String s = "abab"; // you can change to test others
        int ansA = minMoves(s, 'a');
        int ansB = minMoves(s, 'b');
        int ans = (ansA < ansB) ? ansA : ansB;
        System.out.println(ans);
    }
}
