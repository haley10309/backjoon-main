package divisor_multiple;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class dicimal_term {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> dicimal_list = new ArrayList<>();
        int min = Integer.parseInt(br.readLine()); // 최솟값
        if(min == 1){
            min = min +1;
        }
        int max = Integer.parseInt(br.readLine()); // 최댓값
        
        int sum_dicimal = 0;
        for (int index = min; index <= max; index++) { // 소수들의 리스트 만드는 for문
            int divisor = 1;

            for (int i = 2; i < index; i++) { // 소수인지 판별하는 for문
                if ((index % i) == 0) {
                    divisor++;
                }
            }
            if (divisor == 1) {
                dicimal_list.add(index);
            }
        }
        for (int i = 0; i < dicimal_list.size(); i++) { // 소수들의 합을 구하는 for 문
            sum_dicimal = sum_dicimal + dicimal_list.get(i);
           

        }
        if (sum_dicimal != 0) {
            bw.write(sum_dicimal + "\n" + dicimal_list.get(0) + "\n");
        } else {
            bw.write("-1" + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
