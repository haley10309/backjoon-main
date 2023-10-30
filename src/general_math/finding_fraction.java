package general_math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class finding_fraction {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());
        int denom = 1;// 분모
        int numer = 1; // 분자
        int[] small = { numer, denom }; // 최소값
        int[] big = { denom, numer }; // 최댓값
        int[] result = new int[2];
        int[] extreme = new int[2];
        result[0] = numer;// 분자
        result[1] = denom;// 분모
        boolean up = true;
        extreme[0] = result[1];// 1
        extreme[1] = result[0];// 1
        for (int i = 1; i < number; i++) {

            if ((extreme[0] == result[0])&&(extreme[1] == result[1])) {
                denom++; //2
                
                if (denom % 2 != 0) {
                    result[0] = denom + 1;// 4
                    result[1] = 0; // 0
                    
                    up = false;

                } else {
                    
                    result[0] = 0; // 0
                    result[1] = denom + 1; // 3
                    
                    up = true;

                }
                if (up == true) {
                    extreme[0] = result[1] - 1;// 2
                    extreme[1] = result[0] + 1;// 1

                } else {
                    extreme[0] = result[1] + 1;// 1
                    extreme[1] = result[0] - 1;// 3

                }

            }
            if (up == true) {
                result[0]++;
                result[1]--;
            } else {
                result[0]--;// 1
                result[1]++;// 2
            }

        }
        bw.write(result[0] + "/" + result[1]);

        bw.flush();
        bw.close();
        br.close();
    }
}
