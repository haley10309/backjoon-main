package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class count_word {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String text = br.readLine();
        int count_word = 0;
        Matcher matcher = Pattern.compile(" ").matcher(text);
        while (matcher.find()) {
            count_word++;
        }
        if (text.charAt(0) != ' ') {
            count_word++;
        }
        if (text.charAt(text.length() - 1) == ' ') {
            count_word--;
        }
        bw.write(count_word + " ");
        bw.flush();
        bw.close();
        br.close();
    }
}
