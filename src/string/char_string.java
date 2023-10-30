package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class char_string {
    public static void main(String[] args)throws IOException{
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         String word = br.readLine();
         int order = Integer.parseInt(br.readLine());
        bw.write(word.charAt(order-1));
        bw.flush();
        bw.close();
        br.close();
    }
}
