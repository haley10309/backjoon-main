package divisor_multiple;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class finding_dicimal {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> dicimal_list = new ArrayList<>(); //소수 리스트 

        int test = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        int[] test_case = new int[test];
        for(int i=0;i<line.length;i++){
            test_case[i] = Integer.parseInt(line[i]);
        }
        for(int i= 0;i<line.length;i++){
            int divisor = 0;
            for(int j=1;j<(test_case[i]);j++){
                if((test_case[i]%j)==0){
                    divisor++;
                }
            }
            if(divisor == 1){
                dicimal_list.add(test_case[i]);
            }
        }
        bw.write(dicimal_list.size()+"");
        bw.flush();
        bw.close(); 
        br.close();
    }
}
