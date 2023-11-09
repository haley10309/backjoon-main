package Sorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Cut_line {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] first_line = br.readLine().split(" ");
        int test_num = Integer.parseInt(first_line[0]);
        int Cut_line = Integer.parseInt(first_line[1]);
        int[] score = new int[test_num];
        String[] second_line = br.readLine().split(" ");
        for (int i = 0; i < test_num; i++) {

            score[i] = Integer.parseInt(second_line[i]);

        }

        for (int i = 0; i < test_num; i++) {
            
            for (int j = i + 1; j < test_num; j++) {
                if (score[i] < score[j]) {
                    int temp = score[j];
                    score[j] = score[i];
                    score[i] = temp;
                }
            }
            

        }

        bw.write(score[Cut_line - 1] + " ");
        bw.flush();
        bw.close();
        br.close();
    }
}
