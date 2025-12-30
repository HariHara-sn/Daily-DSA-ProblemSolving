import java.util.Scanner;
//Problem -  https://codeforces.com/problemset/problem/1/A
public class TheatreSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();

        long num1 = (long) Math.ceil((double) n / a); // (n + a - 1) / a; ceil divison
        long num2 = (long) Math.ceil((double) m / a);
        

        System.out.println(num1 * num2);
        sc.close();
    }
}

/*
🧩 The core idea

We’re trying to find how many flagstones (of size a) we need to cover a dimension of length n.

That is,

how many full as fit in n, even if the last one doesn’t fit perfectly — we still need a full tile to cover that leftover bit.

🧠 Let’s take an example:

Say you have

n = 6
a = 4


So, how many tiles of 4 meters do you need to cover 6 meters?

1️⃣ The “normal” division (integer division)

If you just do:

n / a

Then:

6 / 4 = 1 (because integer division discards the .5 part)


But does one tile of size 4 cover 6 meters?
No! You’ll have 2 meters left uncovered.

So you need 2 tiles, not 1.

2️⃣ The “ceil” version (always round up)

Mathematically:

ceil(6 / 4) = ceil(1.5) = 2


That’s correct — because after 1 full tile, there’s a leftover piece (2 meters), so you need one more tile.

🧮 Why rounding (like your roundManually()) fails

Your roundManually() tries to round to the nearest integer:

round(1.5) → 2 ✅ (okay for this case)


But what about:

n = 5, a = 4
5 / 4 = 1.25
round(1.25) → 1 ❌ (wrong — we actually need 2 tiles)


You see the issue?
If the leftover portion is less than 0.5, rounding will go down — but we always need to go up, even for a tiny leftover.

That’s why “round” fails but “ceil” works.

📐 Why (n + a - 1) / a works without floating-point
Example 1:

n = 6, a = 4
(6 + 4 - 1) / 4 = 9 / 4 = 2 ✅
 
*/
