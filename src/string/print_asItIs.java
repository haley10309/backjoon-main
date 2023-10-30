package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class print_asItIs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = "";
        int count =1;
        while(true){
            line =br.readLine();
            if(line == null || line.isEmpty() || count>100){ //꼭 null 이랑 isEmpty 같이 써줄 것!
                break;
            }
            bw.write(line+"\n");
            count++;
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
