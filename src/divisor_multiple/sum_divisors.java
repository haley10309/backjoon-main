package divisor_multiple;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class sum_divisors {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> div_arr = new ArrayList<>();
        int num = Integer.parseInt(br.readLine());

        while (num != -1) {
            int sum_div = 0;
            div_arr = new ArrayList<>();
            for (int i = 1; i < num; i++) { // 약수 리스트 구하기
                if ((num % i) == 0) {
                    div_arr.add(i);

                }
            }
            
            for (int i = 0; i < div_arr.size(); i++) {
                sum_div = sum_div + div_arr.get(i);
                
            }
            
            if (sum_div == num) {
                bw.write(num + " = ");
                for (int j = 0; j < div_arr.size(); j++) {
                    bw.write(div_arr.get(j) + "");
                    if (j != (div_arr.size() - 1)) {
                        bw.write(" + ");
                    } else {
                        bw.write("\n");
                    }

                }
            } else {
                bw.write(num + " is NOT perfect.\n");
            }
            num = Integer.parseInt(br.readLine());

        }
        bw.flush();
        bw.close();
        br.close();

    }
}
