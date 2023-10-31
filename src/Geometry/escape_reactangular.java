package Geometry;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class escape_reactangular {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().split(" ");
        int x = Integer.parseInt(line[0]);
        int y = Integer.parseInt(line[1]);
        int w = Integer.parseInt(line[2]);
        int h = Integer.parseInt(line[3]);

        int x_to_zero = x - 0;
        int y_to_zero = y - 0;
        int x_to_w = w - x;
        int y_to_h = h - y;
        int choice1, choice2;
        int short_cut;
        if (x_to_w < y_to_h) {
            choice1 = x_to_w;
        } else {
            choice1 = y_to_h;
        }
        if(x_to_zero<y_to_zero){
            choice2=x_to_zero;
        }else{
            choice2=y_to_zero;
        }
        if(choice1<choice2){
            short_cut = choice1;
        }else{
            short_cut = choice2;
        }
        bw.write(short_cut+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
