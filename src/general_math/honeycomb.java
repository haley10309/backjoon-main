package general_math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class honeycomb {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int number = Integer.parseInt(br.readLine());
        int small =1;
        int big=1;
        int room =1;
        while(true){
            if((small<= number )&&(number <= big)){
                bw.write((room) + "");
                break;
            }
            small = big + 1;
            big = big + (6*room);
            room++;
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
