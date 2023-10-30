package Deepening1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class chess {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] line = br.readLine().split(" ");
        int king = Integer.parseInt(line[0]);
        int queen = Integer.parseInt(line[1]);
        int rook = Integer.parseInt(line[2]);
        int bishop = Integer.parseInt(line[3]);
        int knight = Integer.parseInt(line[4]);
        int pawn = Integer.parseInt(line[5]);
        bw.write((1-king)+" "+(1-queen)+" "+(2-rook)+" "+(2-bishop)+" "+(2-knight)+" "+(8-pawn));
        bw.flush();
        bw.close();
        br.close();
    }
}
