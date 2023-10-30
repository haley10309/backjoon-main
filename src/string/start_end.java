package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class start_end {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<String>word_list = new ArrayList<String>();
        int test_case = Integer.parseInt(br.readLine());
        for(int i =0;i<test_case;i++){
            word_list.add(br.readLine());
        }
        char start ;
        char end;
        for(int i =0;i<test_case;i++){
            String word = word_list.get(i);
            start = word.charAt(0);
            end = word.charAt(word.length()-1);  //마지막 문자위치는 문자열 길이 에서 1을 빼줘야 함.
            bw.write(start);
            bw.write(end);
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
