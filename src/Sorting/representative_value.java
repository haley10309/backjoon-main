package Sorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class representative_value {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] random_num = new int[5];
        for(int i =0;i<5;i++){
            random_num[i] = Integer.parseInt(br.readLine());
        }
       
        for(int i=0;i<5;i++){ //오름 차순으로 정리하는 함수
            int small = random_num[i];
            for(int j = i+1;j<5;j++){
                if(small>random_num[j]){
                    int temp = random_num[i];
                    random_num[i]= random_num[j];
                    random_num[j] = temp;
                }

            }
            

        }
        int sum =0;
        for(int i= 0;i<5;i++){
            sum = sum + random_num[i];
        }
        int average = sum/5;
        bw.write(average+"\n"+ random_num[2]+" ");
        bw.flush();
        bw.close();
        br.close();
        
    }
}
