package divisor_multiple;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class multple_divisor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String[] line = br.readLine().split(" ");
            int first = Integer.parseInt(line[0]);
            int second = Integer.parseInt(line[1]);
            if ((first == 0) && (second == 0)) { // 종료 조건
                break;
            }
            
            if ((second % first) == 0) { // factor 조건
                bw.write("factor\n");
            } else if ((first % second) == 0) { //multiple 조건
                bw.write("multiple\n");
            } else {
                bw.write("neither\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
