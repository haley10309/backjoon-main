package Deepening1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class word_study {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String text = br.readLine().toUpperCase(); //대문자 변환

        int most_used = 0;
        char most_used_letter = ' ';
        // int count = 1;
        // boolean solid = true; //1등이 두개인 경우 false
        int[] alpha_count = new int[26];
        for(int i=0;i<text.length();i++){ //빈도수 나타내는 배열 형성 1차
            char flag = text.charAt(i);
            int flag_num = flag - 'A';
            alpha_count[flag_num] ++;
            if(most_used<alpha_count[flag_num]){
                most_used = alpha_count[flag_num];
            }
        }
        int max_alpha_count = 0;
        for(int i =0;i<26;i++){ //배열 검사해서 중복 확인
            if(alpha_count[i] == most_used){ //중복이면 max_alpha_count 변수 ++
                max_alpha_count++;
                most_used_letter = (char)(i+'A');
            }
        }
        if(max_alpha_count==1){
            bw.write(most_used_letter+"");
        }else{
            bw.write("?");
        }
        


        // for (int i = 0; i < text.length(); i++) {
        //     count = 1;
        //     for (int j = i + 1; j < text.length(); j++) {

        //         if ((text.charAt(i)) == (text.charAt(j))) {
        //             count++;
        //         }

        //     }
        //     if (count == most_used) {
        //         solid = false;
        //     }
        //     if (count > most_used) {
        //         most_used = count;
        //         most_used_letter = text.charAt(i);
        //         solid = true;
        //     }

        // }
        // if (solid == true) {
        //     bw.write(most_used_letter + "");
        // } else {
        //     bw.write("?");
        // }

        bw.flush();
        bw.close();
        br.close();
    }
}
