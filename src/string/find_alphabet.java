package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class find_alphabet {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line =br.readLine();
        for(int i= (int)'a';i<=(int)'z';i++){
            int findIndex = line.indexOf(i) ;
           
            bw.write(findIndex + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
