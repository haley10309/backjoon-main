package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Coordinate_sorting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        int[][] list = new int[num][2];
        for (int i = 0; i < num; i++) {
            String[] line = br.readLine().split(" ");
            list[i][0] = Integer.parseInt(line[0]);
            list[i][1] = Integer.parseInt(line[1]);
        }
        Arrays.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] != o2[0] ? o1[0] - o2[0] : o1[1] - o2[1];

            }
        });
        for (int i = 0; i < num; i++) {
            sb.append(list[i][0] + " " + list[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}
