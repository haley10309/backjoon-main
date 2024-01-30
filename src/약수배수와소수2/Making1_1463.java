package 약수배수와소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Making1_1463 {
    static int count = 0;
    static int[] memo;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        memo = new int[num+1];
        System.out.println(shrink_num(num));
    }

    private static int shrink_num(int num) {
        if (num == 1) {
            return 0;
        }
        if (memo[num] == 0) {
            if ((num % 3 == 0) && (num % 2 == 0)) {
                memo[num] = Math.min(shrink_num(num / 3) + 1, shrink_num(num / 2) + 1);
                return memo[num] = Math.min(memo[num], shrink_num(num - 1) + 1);
            } else if (num % 3 == 0) {
                return memo[num] = Math.min(shrink_num(num / 3) + 1, shrink_num(num - 1) + 1);
            } else if (num % 2 == 0) {
                return memo[num] = Math.min(shrink_num(num / 2) + 1, shrink_num(num - 1) + 1);
            } else {
                return memo[num] = shrink_num(num - 1) + 1;
            }
        } else {
            return memo[num];
        }
    }
}
