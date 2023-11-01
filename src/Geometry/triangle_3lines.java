package Geometry;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class triangle_3lines {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String[] line = br.readLine().split(" ");
            int x = Integer.parseInt(line[0]);
            int y = Integer.parseInt(line[1]);
            int z = Integer.parseInt(line[2]);
            int big;
            int rest;
            if ((x == 0) || (y == 0) || (z == 0)) {
                break;
            }
            if (x < y) {
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
            if (big >= rest) {
                bw.write("Invalid\n");
            } else if ((x != y) && (y != z) && (z != x)) {
                bw.write("Scalene\n");
            } else if ((x == y) && (y == z)) {
                bw.write("Equilateral\n");
            } else {
                bw.write("Isosceles\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
