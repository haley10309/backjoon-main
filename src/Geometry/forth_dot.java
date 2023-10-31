package Geometry;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class forth_dot {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a[] = new int[2];
        int b[] = new int[2];
        int c[] = new int[2];
        int d[] = new int[2];

        for (int i = 0; i < 3; i++) {
            String[] line = br.readLine().split(" ");
            if (i == 0) {
                a[0] = Integer.parseInt(line[0]);
                a[1] = Integer.parseInt(line[1]);
            }
            if (i == 1) {
                b[0] = Integer.parseInt(line[0]);
                b[1] = Integer.parseInt(line[1]);

            }
            if (i == 2) {
                c[0] = Integer.parseInt(line[0]);
                c[1] = Integer.parseInt(line[1]);
            }
        }
        if(a[0]==b[0]){ //x좌표
            d[0]=c[0];
        }else if(b[0]==c[0]){
            d[0] = a[0];
        }else{
            d[0] = b[0];
        }
         if(a[1]==b[1]){ //y좌표
            d[1]=c[1];
        }else if(b[1]==c[1]){
            d[1] = a[1];
        }else{
            d[1] = b[1];
        }
        bw.write(d[0]+" "+ d[1]+" ");
        bw.flush();
        bw.close();
        br.close();
    }
}
