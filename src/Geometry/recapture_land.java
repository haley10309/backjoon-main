package Geometry;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class recapture_land {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num_dot = Integer.parseInt(br.readLine());
        int x_small = 0, y_small = 0, x_big = 0, y_big = 0;
        int[][] dot = new int[num_dot][2]; // dot[][0] -> x좌표 , dot[][1] -> y좌표

        for (int i = 0; i < num_dot; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < 2; j++) {
                dot[i][j] = Integer.parseInt(line[j]);
            }
        }

        // 문제 없음.
        x_small = dot[0][0];
        x_big = dot[0][0];
        y_small = dot[0][1];
        y_big = dot[0][1];
        for (int j = 1; j < num_dot; j++) {

            if (dot[j][0] < x_small) {
                x_small = dot[j][0];
            }
            if (dot[j][0] > x_big) {
                x_big = dot[j][0];
            }
        }
        for (int j = 1; j < num_dot; j++) {

            if (dot[j][1] < y_small) {
                y_small = dot[j][1];
            }
            if (dot[j][1] > y_big) {
                y_big = dot[j][1];
            }
        }

        if (num_dot < 2) { //점 2개여도 땅 측정 가능

            bw.write("0");

        } else {
            int result = (x_big - x_small) * (y_big - y_small);
            bw.write(result + " ");
            

        }

        bw.flush();
        bw.close();
        br.close();

    }
}
