package oneD_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class leftover {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int dif_left = 0;
        int[] list = new int[42];

        for (int i = 0; i < list.length; i++) { // 나머지 빈도 리스트 초기화
            list[i] = -1;
        }
        for (int i = 0; i < 10; i++) { // 입력 10번 받음.
            int num = Integer.parseInt(br.readLine());
            int left_over = num % 42;
            for (int j = 0; j < list.length; j++) {
                if (left_over == (j)) {
                    list[j]++;
                }
            }

        }
        for (int i = 0; i < list.length; i++) { // 서로 다른 나머지 몇개인지 세기
            if (list[i] != -1) {
                dif_left++;

            }
        }
        bw.write(dif_left + " ");
        bw.close();
        br.close();
    }
}
