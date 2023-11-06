package Brute_force;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class online_class {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] line = br.readLine().split(" ");
        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);
        int c = Integer.parseInt(line[2]);
        int d = Integer.parseInt(line[3]);
        int e = Integer.parseInt(line[4]);
        int f = Integer.parseInt(line[5]);
        for(int i=-999;i<=999;i++){
            for(int j = -999;j<=999;j++){
                if(((a*i)+(b*j)==c)&&((d*i)+(e*j)==f)){
                    bw.write(i+" "+j);
                    break;
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
