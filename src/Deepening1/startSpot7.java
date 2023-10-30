package Deepening1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class startSpot7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = br.readLine();
        int num = Integer.parseInt(line);
        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= (num - i); j++) {
                bw.write(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                bw.write("*");
            }

            bw.write("\n");

        }
        for (int i = num - 1; i >= 1; i--) {

            for (int j = 1; j <= (num - i); j++) {
                bw.write(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                bw.write("*");
            }

            bw.write("\n");

        }
        bw.flush();
        bw.close();
        br.close();
    }
}
