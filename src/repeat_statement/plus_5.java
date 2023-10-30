package repeat_statement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class plus_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean end = false;
        while (end == false) {
            String[] arr = br.readLine().split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            if ((a == 0) && (b == 0)) {
                end = true;
            } else {
                int c = a + b;
                bw.write(String.valueOf(c));
                bw.write("\n");
                
            }

        }

        bw.flush();
        bw.close();
        br.close();
    }
}
