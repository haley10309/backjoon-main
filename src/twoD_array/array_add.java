package twoD_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class array_add {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] line = br.readLine().split(" ");
        int row = Integer.parseInt(line[0]);
        int column = Integer.parseInt(line[1]);
        int[][] A_array = new int[row][column];
        int[][] B_array = new int[row][column];
        for (int i = 0; i < row; i++) {  //A행렬 형성
            String[] array_text = br.readLine().split(" ");
            for (int j = 0; j < column; j++) {
                A_array[i][j] = Integer.parseInt(array_text[j]);
            }
        }
        for (int i = 0; i < row; i++) {  //B행렬 형성
            String[] array_text = br.readLine().split(" ");
            for (int j = 0; j < column; j++) {
                B_array[i][j] = Integer.parseInt(array_text[j]);
            }
        }
        int[][] result_array = new int[row][column];
        for(int i=0;i<row;i++){  //행렬간 덧셈
            for(int j=0;j<column;j++){
                result_array[i][j] = (A_array[i][j]+B_array[i][j]);
                bw.write(result_array[i][j]+" ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();

        
    }
}
