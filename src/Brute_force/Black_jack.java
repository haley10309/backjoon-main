package Brute_force;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Black_jack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] line = br.readLine().split(" ");

        int card_num = Integer.parseInt(line[0]); // 카드의 갯수
        int target_num = Integer.parseInt(line[1]); // 맞추거나 넘으면 안되는 수
        int[] card = new int[card_num];

        String[] numbers = br.readLine().split(" ");

        for (int i = 0; i < card_num; i++) { // 입력 받은 카드의 숫자를 배열화 하는 함수
            card[i] = Integer.parseInt(numbers[i]);
        }
        int sum = 0;
        for (int i = 0; i < card_num; i++) {
            for (int j = i + 1; j < card_num; j++) {
                for (int k = j + 1; k < card_num; k++) {
                    int temp = (card[i] + card[j] + card[k]);
                    if (target_num >= temp ) {
                        if (sum < (card[i] + card[j] + card[k])) {
                            sum = (card[i] + card[j] + card[k]);
                            
                        }
                    }

                }
            }
        }
        bw.write(sum + "");
        bw.flush();
        bw.close();
        br.close();

    }
}
