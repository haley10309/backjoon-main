package divisor_multiple;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class finding_divisor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().split(" ");
        int num = Integer.parseInt(line[0]); // 나눠지는 수
        int order = Integer.parseInt(line[1]); // x번째로 작은 약수
        ArrayList<Integer> div_arr = new ArrayList<>(); // 약수의 작은 순서대로 넣을 리스트

        for (int i = 1; i <= num; i++) {
            if ((num % i) == 0) {
                div_arr.add(i);
            }
        }

        
        if (div_arr.size() < order) {
            bw.write("0");
        } else {
            bw.write(div_arr.get((order - 1)) + "");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
