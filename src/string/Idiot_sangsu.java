package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Idiot_sangsu { // 문자열 거꾸로 뒤집기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] line = br.readLine().split(" ");
        String first = line[0];
        String second = line[1];
        String first_reverse = "";
        String second_reverse = "";
        for (int i = first.length() - 1; i >= 0; i--) { //문자열 거꾸로 뒤집는 방법 **
            first_reverse = first_reverse + first.charAt(i);
        }
        for (int i = second.length() - 1; i >= 0; i--) {
            second_reverse = second_reverse + second.charAt(i);
        }
        if(Integer.parseInt(first_reverse)>Integer.parseInt(second_reverse)){
            bw.write(first_reverse+"");
        }else{
            bw.write(second_reverse+"");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
