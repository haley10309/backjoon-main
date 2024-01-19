package twoD_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class color_paper2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int paper_num = Integer.parseInt(br.readLine());
        int[][] white_paper = new int[101][101];
        int black_part = 0;

        int[] dx = { -1, 1, 0, 0 };
        int[] dy = { 0, 0, 1, -1 };

        for (int i = 0; i < paper_num; i++) {
            String[] line = br.readLine().split(" ");
            int x = Integer.parseInt(line[0]);
            int y = Integer.parseInt(line[1]);
            for (int j = x; j < (x + 10); j++) {
                for (int k = y; k < (y + 10); k++) {
                    if (white_paper[j][k] == 0) {
                        white_paper[j][k]++;
                    }
                }
            }

        }
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (white_paper[i][j] == 1) {
                    for (int k = 0; k < 4; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        if ((nx >= 1) && (nx <= 100) && (ny >= 1) && (ny <= 100) && white_paper[nx][ny] == 0) {
                            black_part++;
                        }else if(nx<1||(nx>100)||(ny<1)||(ny>100)){
                            black_part++;
                        }
                    }
                }
            }
        }

        sb.append(black_part).append(" ");
        System.out.println(sb);
    }
}
