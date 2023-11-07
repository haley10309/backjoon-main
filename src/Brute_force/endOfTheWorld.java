package Brute_force;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class endOfTheWorld {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int order = Integer.parseInt(br.readLine());
        int num = 666;
        int end_condition =0;
        while(true){
            String s_num = Integer.toString(num);
            if(s_num.contains("666")){
                end_condition ++;

            }
            if(end_condition == order){
                bw.write(s_num+" ");
                break;
            }
            num++;
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
