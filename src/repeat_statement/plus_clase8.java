package repeat_statement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class plus_clase8 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        for(int i=0;i<num;i++){
           String[] arr = br.readLine().split(" ");
           int a = Integer.parseInt(arr[0]);
           int b = Integer.parseInt(arr[1]);
           int c = a+b;
           bw.write("Case #"+(i+1)+": "+(a)+" + "+(b)+" = "+c+"\n");

        }
        bw.flush();
        bw.close();
        br.close();
    }
}
