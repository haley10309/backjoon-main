package general_math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class center_move_algorithm {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int test_count = Integer.parseInt(br.readLine()); //수열의 갯수
        int first_num =2;
        int result =first_num;
        double multi;
        for(int i=0;i<test_count;i++){
             multi = Math.pow(first_num, i); //1
             result = result+(int)multi;
        }
        bw.write(result*result+" ");
        bw.flush();
        bw.close();
        br.close();
        
    }
}
