package twoD_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class max_num {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] array = new int[9][9];
        

        for(int i=0;i<9;i++){  //9*9 행렬 형성
            String[] line = br.readLine().split(" ");
            for(int j=0;j<9;j++){
                array[i][j] = Integer.parseInt(line[j]);
            }
        }
        int max_num =array[0][0];
        int max_row=0;
        int max_col =0;
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(max_num<array[i][j]){
                    max_num = array[i][j];
                    max_row =i;
                    max_col =j;
                }
            }
        }
        bw.write(max_num+"\n");
        bw.write((max_row+1)+" "+(max_col+1));
        bw.flush();
        bw.close();
        br.close();

    }
}
