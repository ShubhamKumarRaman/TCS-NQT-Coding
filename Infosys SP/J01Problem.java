/*
You are given an integer N.

You have to choose a set of integers S from the range [1, N-1] such that the product of integers in S is 1 modulo N. This means that if N=5, we can choose set S = [1,2,3] as the product is 6 and 6 modulo 5 is 1.

Find the length of the biggest set S you can choose.

Input Format

The first line contains an integer N, denoting the given integer.

Constraints

1<=N<= 5 * 10^5

Sample Input 1

7

Sample Output 1

5

Explanation:

We can choose set (1,2,3,4,5). Here product = 120 which mod 7 is 1

Sample Input 2

5

Sample Output 2

3

Explanation:

Here we can choose set (1,2,3) where product is 6 and 6 mod 5 =1

Sample Input 3

4

Sample Output 3

1

Explanation

Here we choose only (1)
*/

import java.util.Scanner;

public class J01Problem {
    // using DP
    public static int solution(int n) {
        int[] dp = new int[n];
        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            dp[i] = i + dp[i - 1];
            if (dp[i] % n == 1) {
                dp[0] = i;
            }
        }
        return dp[0];
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // System.out.println(solution(n));

        System.out.println("N= 5 -> Answer:- " + solution(5));
    }
}