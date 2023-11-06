package Brute_force;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class paint_chess {
    public static void main(String[] args) throws IOException {
        char[][] wanted_chess1 = { { 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' },
                { 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' },
                { 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' },
                { 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' },
                { 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' },
                { 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' },
                { 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' },
                { 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' }, };
        char[][] wanted_chess2 = { { 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' },
                { 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' },
                { 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' },
                { 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' },
                { 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' },
                { 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' },
                { 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' },
                { 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' }, };
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] box_size = br.readLine().split(" ");
        int row = Integer.parseInt(box_size[0]);
        int col = Integer.parseInt(box_size[1]);
        int[] test_case1 = new int[(row - 7) * (col - 7)]; // 총 검사해야 하는 판의 개수 for wanted_chess1
        int[] test_case2 = new int[(row - 7) * (col - 7)]; // 총 검사해야 하는 판의 개수 for wanted_chess2
        char[][] chess_origin = new char[row][col]; // 입력받은 원래 체스판

        for (int i = 0; i < row; i++) { // 입력받은 체스판 처리
            String line = br.readLine();
            for (int j = 0; j < col; j++) {
                chess_origin[i][j] = line.charAt(j);
            }
        }
        int small = 0;

        for (int j = 0; j < (row - 7); j++) { // row 체스판 검사 시작점

            for (int k = 0; k < (col - 7); k++) {// column 체스판 검사 시작점
                test_case1[0] = 0;

                for (int a = j; a < (j + 8); a++) {
                    for (int b = k; b < (k + 8); b++) {
                        if (chess_origin[a][b] != wanted_chess1[a - j][b - k]) {
                            test_case1[0]++;
                        }

                    }
                }
                if ((j == 0) && (k == 0)) {
                    small = test_case1[0];
                }
                if (small > test_case1[0]) {
                    small = test_case1[0];
                }
            }
        }

        for (int j = 0; j < (row - 7); j++) { // row 체스판 검사 시작점

            for (int k = 0; k < (col - 7); k++) {// column 체스판 검사 시작점
                test_case2[0] = 0;

                for (int a = j; a < (j + 8); a++) {
                    for (int b = k; b < (k + 8); b++) {
                        if (chess_origin[a][b] != wanted_chess2[a - j][b - k]) {
                            test_case2[0]++;
                        }

                    }
                }
                if (small > test_case2[0]) {
                    small = test_case2[0];
                }
            }
        }
        bw.write(small + " ");
        bw.flush();
        bw.close();
        br.close();

    }

}
