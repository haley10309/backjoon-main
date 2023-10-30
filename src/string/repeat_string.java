package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class repeat_string {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int test_case = Integer.parseInt(br.readLine());
        for (int i = 0; i < test_case; i++) {  //테스트할 예시의 갯수 ... 입력1
            String[] input = br.readLine().split(" ");
            int times = Integer.parseInt(input[0]);  //반복할 획수
            String text = input[1];                  //반복할 단어
            for (int j=0;j<text.length(); j++) {
                for(int k =0;k<times;k++){
                    bw.write(text.charAt(j)+"");
                }
                
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
