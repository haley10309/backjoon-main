package Sorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ascending {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int[] arr_num = new int[num];
        for (int i = 0; i < num; i++) { // 숫자들을 배열에 집어 넣기
            arr_num[i] = Integer.parseInt(br.readLine());
        }
        int small = arr_num[0];
        for (int i = 0; i < num; i++) {
            small = arr_num[i];
            for (int j = i+1; j < num; j++) {
                if(small>arr_num[j]){
                    int temp  = small;
                    small = arr_num[j];
                    arr_num[j] = temp;
                }
            }
            arr_num[i] = small;
            bw.write(arr_num[i]+"\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
