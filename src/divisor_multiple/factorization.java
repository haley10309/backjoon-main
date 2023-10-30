package divisor_multiple;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class factorization {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int max = (int) Math.sqrt(num) + 1;

        ArrayList<Integer> dicimal_list = new ArrayList<>();
        ArrayList<Integer> factorized_list = new ArrayList<>();
        
        for (int index = 2; index <= max; index++) { // 소수 리스트 구하는 for문
            int dicimal = 1;
            for (int i = 2; i < index; i++) {
                if ((index % i) == 0) {
                    dicimal++;
                }
            }
            if (dicimal == 1) {
                dicimal_list.add(index);
            }
        }
        for (int i = 0; i < dicimal_list.size(); i++) {


            while (true) {
                if ((num % dicimal_list.get(i)) != 0) {
                    break;
                } else {
                    num = num / dicimal_list.get(i);
                    factorized_list.add(dicimal_list.get(i));
                    bw.write(dicimal_list.get(i) + "\n");
                }

            }
        }
        
        
        
        if (num == 1) {
            bw.write(" ");
        }else{
            bw.write(num+"\n");
            factorized_list.add(num);
        }
        // if (factorized_list.size() == 0) {
        //     bw.write(num + "\n");
        // }
        bw.flush();
        bw.close();
        br.close();
    }
}
