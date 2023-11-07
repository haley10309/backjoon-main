package Brute_force;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class sugar_delivery {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int weight = Integer.parseInt(br.readLine());

        int f_num = 0;
        int t_num = 0;
        for (int i = (weight / 5); i >= 0; i--) { // i == 5킬로 그램 설탕의 갯수
            int rest_weight = weight - (i * 5);
            if ((rest_weight % 3) == 0) {
                f_num = i ;
                t_num = rest_weight /3;
                
                break;
            }
        }
        if((f_num == 0)&&(t_num ==0)){
            bw.write("-1");
        }else{
            bw.write(f_num+t_num+" ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
