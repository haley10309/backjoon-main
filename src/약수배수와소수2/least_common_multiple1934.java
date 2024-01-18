package 약수배수와소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class least_common_multiple1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int test_case = Integer.parseInt(br.readLine());
        for (int i = 0; i < test_case; i++) {
            int min = 1, max = 1;
            String[] line = br.readLine().split(" ");
            int first = Integer.parseInt(line[0]);
            int second = Integer.parseInt(line[1]);
            for (int j = 1; (j <= first) && (j <= second); j++) { // 최대 공약수 구하는 반복문
                if ((first % j == 0) && (second % j == 0)) {
                    max = j;
                }
            }
            min = (first * second) / max;
            sb.append(min + "\n");
        }
        System.out.println(sb);
    }
}
