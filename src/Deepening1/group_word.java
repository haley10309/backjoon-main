package Deepening1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class group_word {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = br.readLine(); // 단어의 갯수 입력 ---1
        int word_num = Integer.parseInt(line);
        int group_word = 0;
        int groug_word_count = 0;
        for (int i = 0; i < word_num; i++) { // 단어의 갯수
            String text = br.readLine(); // 단어 입력 ---2
            char[] alpha_array = new char[text.length()];
            for (int j = 0; j < text.length(); j++) { // 한 단어의 길이만큼 검사 j = 검사하고 있는 알파벳

                if (j <= 1) {
                    alpha_array[j] = text.charAt(j);
                    group_word = 0;

                } else {
                    for (int k = 0; k <= j; k++) { // k = j를 검사하기 위한 알파벳
                        if (alpha_array[k] == text.charAt(j)) {

                            for (int a = k; a < j; a++) {
                                if (text.charAt(a) != text.charAt(j)) {
                                    group_word++;
                                } else {

                                }
                            }

                        } else {
                            alpha_array[j] = text.charAt(j);

                        }
                    }
                }

            }
            if (group_word == 0) {
                groug_word_count++;

            }
        }
        bw.write(groug_word_count + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
