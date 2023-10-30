package general_math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class formation_change {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] line = null;
        try {
            line = br.readLine().split(" ");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String number = line[0]; // 문자
        int form = Integer.parseInt(line[1]); // 진수
        int result = 0;
        for (int i = 0; i < number.length(); i++) {
            char index = number.charAt(i);
            int index_num; // 문자 중에 한 문자
            if(('A'<=index) && (index <='Z')){
                index_num = index-'A'+10;
            }else{
                index_num = index-'0';
            }
            
            int square = 1;
            for (int j = number.length() - i - 1; j > 0; j--) {

                square = square * form;

            }

            result = result + (index_num * square);
        }
        try {
            bw.write(result + " ");
            bw.flush();
            bw.close();
            br.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
