package 약수배수와소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Making1_1463 {
    static int count = 0;
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());

        if (num == 1) {
            list.add(count);
        } else {
            shrink_num(num);
        }
        Collections.sort(list);
        sb.append(list.get(0));
        System.out.println(sb);
    }

    private static void shrink_num(int num) {
        if (num == 1) {
            list.add(count);
        } else if (num % 3 == 0) {
            count++;
            shrink_num(num / 3);
        } else if ((num % 3 == 1) && (num % 2 == 0)) {
            count++;
            shrink_num(num - 1);
            shrink_num(num / 2);
        } else if (num % 2 == 0) {
            count++;
            shrink_num(num / 2);
        } else {

            count++;
            shrink_num(num - 1);
        }

    }
}
