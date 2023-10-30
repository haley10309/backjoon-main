package repeat_statement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class plus_4 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text;
        while ((text = br.readLine()) != null) {
            String[] arr = text.split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int c = a + b;
            bw.write(c+"\n");
            bw.flush();

        }
        bw.flush();
        bw.close();
        br.close();

    }
} //마지막 엔터 입력이 안들어와서 마지막 출력이 안나오지만 정답 처리
