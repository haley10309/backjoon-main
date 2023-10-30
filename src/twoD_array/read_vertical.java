package twoD_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class read_vertical {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[][] arr = new char[5][15];
        for (int i = 0; i < 5; i++) { // 배열로 받기
            String line = br.readLine();
            for (int j = 0; j < line.length(); j++) {//line 의 길이 만큼 할당을 해줘야지 나머지가 null이됨.
                arr[i][j] = line.charAt(j);
                

            }
            
        }
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[j][i] != 0) {
                    bw.write(arr[j][i] + "");
                }

            }

        }
        bw.flush();
        bw.close();
        br.close();
    }
}
