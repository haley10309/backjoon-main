package 약수배수와소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class fraction_sum {
    public static void main(String[] args) throws IOException {
        // 분수간 더하기 문제
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] first_frac = new int[2];
        int[] second_frac = new int[2];

        String[] first_line = br.readLine().split(" ");
        first_frac[0] = Integer.parseInt(first_line[0]);// 분자
        first_frac[1] = Integer.parseInt(first_line[1]);// 분모
        // 기약 분수로 만들기

        String[] second_line = br.readLine().split(" ");
        second_frac[0] = Integer.parseInt(second_line[0]);// 분자
        second_frac[1] = Integer.parseInt(second_line[1]);// 분모
        // 기약 분수로 만들기

        int least_common_multiple = 1;
        int greatest_common_divisor = 1;
        // 분모 간 최대 공약수 구하기
        for (int i = 1; (i <= first_frac[1]) && (i <= second_frac[1]); i++) {
            if ((first_frac[1] % i == 0) && (second_frac[1] % i == 0)) {
                least_common_multiple = i;
            }
        }
        // 분모간 최소 공배수 구하기
        greatest_common_divisor = (first_frac[1] * second_frac[1]) / least_common_multiple;
        // 분자 간의 합
        int first_numerator = first_frac[0] * (greatest_common_divisor / first_frac[1]);
        int second_numerator = second_frac[0] * (greatest_common_divisor / second_frac[1]);
        int son_sum = first_numerator + second_numerator;
        //기약 분수 만들기
        
        for (int i = 2; (i <= greatest_common_divisor) && (i <= son_sum); i++) {
            if ((son_sum % i == 0) && (greatest_common_divisor % i == 0)) {
                greatest_common_divisor = greatest_common_divisor / i;
                son_sum = son_sum / i;
                i--;
            }
        }
        sb.append(son_sum).append(" ").append(greatest_common_divisor);
        System.out.println(sb);
        br.close();

    }
}
