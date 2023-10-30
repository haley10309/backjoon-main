package Deepening1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class croatia_alpha {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // String[] croatia = new String[] { "c=", "c-", "dz=", "d-", "lj", "nj", "s=",
        // "z=" };
        String text = br.readLine();

        int word_count = 0; // 전체 알파벳의 갯수
        int alpha_length = text.length(); // 크로아티아 알파벳을 제외한 알파펫의 갯수

        
        for (int i = 0; i < (text.length() - 1); i++) {
            if (text.charAt(i) == 'c') {
                if (text.charAt(i + 1) == '=') {
                    word_count++;
                    alpha_length = alpha_length - 2;
                }
                if (text.charAt(i + 1) == '-') {
                    word_count++;
                    alpha_length = alpha_length - 2;
                }
            }
            if (text.charAt(i) == 'd') {

                if (text.charAt(i + 1) == '-') {
                    word_count++;
                    alpha_length = alpha_length - 2;
                }
            }
            if (text.charAt(i) == 'l') {
                if (text.charAt(i + 1) == 'j') {
                    word_count++;
                    alpha_length = alpha_length - 2;
                }
            }
            if (text.charAt(i) == 'n') {
                if (text.charAt(i + 1) == 'j') {
                    word_count++;
                    alpha_length = alpha_length - 2;
                }
            }

            if ((text.charAt(i) == 's') && (text.charAt(i + 1) == '=')) {
                word_count++;
                alpha_length = alpha_length - 2;
            }
            if ((text.charAt(i) == 'z') && (text.charAt(i + 1) == '=')) { //여기가 맞추기 까다로운 부분!!ㄹ
                if(i>=1){
                    if(text.charAt(i-1)=='d'){
                        word_count++;
                        alpha_length = alpha_length - 3;
                    }
                    else{
                    word_count++;
                    alpha_length = alpha_length - 2;
                }
                }else{
                    word_count++;
                    alpha_length = alpha_length - 2;
                }

            }
        }
        word_count = word_count + alpha_length;
        bw.write(word_count + "");
        bw.flush();
        bw.close();
        br.close();

    }

}
