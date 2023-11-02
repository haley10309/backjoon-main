package Brute_force;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Disassemble_sum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        String Num_str = Integer.toString(num);
        int num_length = Num_str.length();
        int constructor =1 ; // 생성자
        ArrayList<Integer> result = new ArrayList<Integer>();
        
       

        while (true) {
            int sum = 0;
            String strNum = Integer.toString(constructor);
            int[] arrNum = new int[strNum.length()];
            
            for (int i = 0; i < strNum.length(); i++) {
                arrNum[i] = strNum.charAt(i) - '0';
                sum = sum + arrNum[i];
                
            }
            

            sum = sum + constructor;
            if (sum == num) {
                result.add(constructor);
                bw.write(constructor + " ");
                break;
            }else if (sum > num){
                break;
            }
            constructor++;
        }
        if(result.size() ==0){
            bw.write("0\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
