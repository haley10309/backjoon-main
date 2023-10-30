package oneD_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class paper_due {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] list = new int[30];
        for(int i =0;i<list.length;i++){
            list[i] = 0;
        }
        for(int i =0;i<28;i++){
            int attend_line = Integer.parseInt(br.readLine());
            for(int j =0;j<list.length;j++){
                if(attend_line==(j+1)){
                    list[j] =1;
                }
            }

        }
        for(int i =0;i<list.length;i++){
            if(list[i] ==0){
                bw.write((i+1)+"\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
        
    }
}
