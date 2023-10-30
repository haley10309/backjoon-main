package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class sum_num {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int whole_num = Integer.parseInt(br.readLine());
        String line = br.readLine();
        int[] num = new int[whole_num];
        for(int i =0;i<whole_num;i++){
            num[i] = line.charAt(i) - '0';
        }
        int sum =0;
        for(int i =0;i<whole_num;i++){
            sum =sum+ num[i];
           
        }
        bw.write(sum+" ");
        bw.flush();
        bw.close();
        br.close();
    }
}
