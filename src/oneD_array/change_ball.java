package oneD_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class change_ball {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] line = br.readLine().split(" "); // 바구니 숫자 + 바꾸는 방식의 갯수.... 입력(1)
        int basket_kind = Integer.parseInt(line[0]);
        int change_kind = Integer.parseInt(line[1]);
        int[] ball_in_basket = new int[basket_kind];
        for (int a = 0; a < ball_in_basket.length; a++) { // 바구니 내에 있는 공의 숫자 초기화
            ball_in_basket[a] = a + 1;
        }
        for (int a = 0; a < change_kind; a++) {
            String[] change_basket = br.readLine().split(" ");
            int i = Integer.parseInt(change_basket[0]) - 1; // 바꾸고자 하는 줄의 실질적 배열의 순서는 1을 빼야 하므로 !
            int j = Integer.parseInt(change_basket[1]) - 1;
            int temp = ball_in_basket[i];
            ball_in_basket[i] = ball_in_basket[j];
            ball_in_basket[j] = temp;

        }
        for (int a = 0; a < ball_in_basket.length; a++) {
            bw.write(ball_in_basket[a] + " ");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
