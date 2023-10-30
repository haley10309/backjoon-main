package twoD_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class color_paper {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] w_paper = new int[100][100];
        for (int i = 0; i < 100; i++) { // 도화지 2차원 배열 초기화
            for (int j = 0; j < 100; j++) {
                w_paper[i][j] = 0;
            }
        }
        int b_paper_count = Integer.parseInt(br.readLine());
        for (int i = 0; i < b_paper_count; i++) {
            String[] temp = br.readLine().split(" ");
            int x = Integer.parseInt(temp[0]);
            int y = Integer.parseInt(temp[1]);
            for (int j = (x - 1); j < (x + 9); j++) {
                for (int k = (y - 1); k < (y + 9); k++) {
                    w_paper[j][k]++;
                }
            }

        }
        int count=0;
        for (int i = 0; i < 100; i++) { // 도화지 2차원 배열 초기화
            for (int j = 0; j < 100; j++) {
                if(w_paper[i][j]>0){
                    count++;
                }
            }
        }
        bw.write(count+" ");
        bw.flush();
        bw.close();
        br.close();
    }
}
