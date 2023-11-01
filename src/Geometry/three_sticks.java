package Geometry;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class three_sticks {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] line = br.readLine().split(" ");
        int x = Integer.parseInt(line[0]);
        int y = Integer.parseInt(line[1]);
        int z = Integer.parseInt(line[2]);
        int big, rest;
        if ((x < y)) {
            if (y < z) {
                big = z;
                rest = x + y;
            } else {
                big = y;
                rest = x + z;
            }
        } else {
            if (x < z) {
                big = z;
                rest = x + y;
            } else {
                big = x;
                rest = y + z;
            }
        }
        if(big>= rest){
            big = rest -1; 
        }
        int result = big + rest;
        bw.write(result+" ");
        bw.flush();
        bw.close();
        br.close();
    }
}
