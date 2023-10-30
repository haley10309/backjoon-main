package general_math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class formation_change2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> result = new ArrayList<>();
        String[] line = br.readLine().split(" ");
        int number = Integer.parseInt(line[0]);
        int form = Integer.parseInt(line[1]); // 진법
        // 자릿수 구하기
        int num_len = 0;
        double form_square; // 진법의 n제곱
        double form_square_plus;
        int k=0;
        while (true) {
            
            form_square = Math.pow(form, k);
            form_square_plus = Math.pow(form, (k + 1));
            if ((number >= form_square) && (number < form_square_plus)) {
                num_len = k + 1;
                break;
            }
            k++;
        }
        // 각 자리에 숫자 구하기
        for (int i = 1; i <= num_len; i++) {
            int j = 0;
            while (true) {

                double smaller = Math.pow(form, (num_len  - i)) * j;
                double bigger = Math.pow(form, (num_len - i)) * (j + 1);
                if ((number >= smaller) && (number < bigger)) {
                    result.add(j);
                    number = number - (int) smaller;
                    break;
                } 
                    j++;
                
            }
        }
        //결과값 내보내는 방법 (10분위 이상되는 진법일 때 주의)
        for(int i =0;i<num_len;i++){
            int out = result.get(i);
            if(out >9){
                char out_alpha = (char)(out +'A'-10);
                bw.write(out_alpha+"");
            }else{
                bw.write(out+"");
            }
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
