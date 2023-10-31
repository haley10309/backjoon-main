package Geometry;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class math_is_PE {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long block = Long.parseLong(br.readLine());
        long result = block*4;

        bw.write(result+" ");
        bw.flush();
        bw.close();
        br.close();
    }
}
