package 약수배수와소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class least_common_multiple14231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] line = br.readLine().split(" ");
        long first = Long.parseLong(line[0]);
        long second = Long.parseLong(line[1]);
        long min = 1, max = 1;
        for (long i = 1; (i <= first) && (i <= second); i++) {
            if ((first % i == 0) && (second % i == 0)) {
                max = i;
            }
        }
        min = (first * second) / max;
        sb.append(min).append(" \n");
        System.out.println(sb);
    }
}
