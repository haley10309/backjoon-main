package Brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SnowWhite_2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] dwarf = new int[9];
        for (int i = 0; i < 9; i++) {
            dwarf[i] = Integer.parseInt(br.readLine());
        }
        
        boolean done = false;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                List<Integer> list = new ArrayList<>();
                for (int k = 0; k < 9; k++) { // 9명 중 7명 고르기
                    if ((j != k) && (i != k) && (j != i)) {
                        list.add(dwarf[k]);
                    }
                }
                int sum = 0;
                for (int k = 0; k < list.size(); k++) {
                    sum = sum + list.get(k);
                }
                if (sum == 100) {
                    Collections.sort(list);
                    for (int k = 0; k < list.size(); k++) {
                        sb.append(list.get(k)).append("\n");
                    }
                    
                    done = true;
                    break;
                }

            }
            if (done) {
                break;
            }
        }
        System.out.println(sb);
    }
}
