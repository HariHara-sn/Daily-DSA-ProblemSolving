public class Pow {
    public static double myPow(double x, int n) {
        if (n > 0) {
            return (double) (Math.pow(x, n));
        } else {
            return (double) (1 / Math.pow(x, n));
        }
    }

    public static void main(String[] args) {
        System.out.println(myPow(2.00000, 10));
    }
}
