package oneD_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class mostBig_location {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] num_list= new int[9];

        for (int i = 0; i < 9; i++) {
            num_list[i] = Integer.parseInt(br.readLine());
        }
        int most_big = num_list[0];
        int order = 1; //0이라고 초기화 해놨어서 틀렸었음. 
        for(int i =1;i<9;i++){
            if(most_big<num_list[i]){
                most_big=num_list[i];
                order = i+1;
            }
        }
        bw.write(most_big+"\n"+(order));
        bw.flush();
        bw.close();
        br.close();

    }
}
