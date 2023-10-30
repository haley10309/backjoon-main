package Deepening1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class palindrome { //문자열 비교는 꼭 equals 사용하기!!
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        int line_length = line.length();
        char[] char_list = new char[line_length];
        
        for(int i =0;i<line_length;i++){
            char_list[i] = line.charAt(line_length-i-1);
        }
        String reverse = new String(char_list);
        if(line.equals(reverse)){
            bw.write(1+"");

        }else{
            bw.write(0+"\n");
            
        }
        bw.flush();
        bw.close();
        br.close();
        
    }
}
