package Set_Map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Number_Card2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int sk_card_num = Integer.parseInt(br.readLine()); // 상근이가 가지고 있는 카드의 갯수
        HashMap<Integer, Integer> sk_card = new HashMap<>(); // 상근이가 가지고 있는 카드 내 숫자 key == 숫자 종류  !! value == 숫자의 빈도수
        String[] sk_line = br.readLine().split(" ");
        for (int i = 0; i < sk_card_num; i++) { // 상근이가 가지고 있는 카드의 숫자 입력 받기
            if (sk_card.containsKey(Integer.parseInt(sk_line[i]))) {
                int temp = sk_card.get(Integer.parseInt(sk_line[i])) + 1;
                sk_card.put(Integer.parseInt(sk_line[i]), temp);
            } else {
                sk_card.put(Integer.parseInt(sk_line[i]), 1);
            }

        }

        int test_num = Integer.parseInt(br.readLine()); // 테스트 해봐야 할 숫자의 갯수
        int[] test_card = new int[test_num]; // 테스트 해봐야 할 숫자 종류
        String[] test_line = br.readLine().split(" ");
        for (int i = 0; i < test_num; i++) {  //테스트 해봐야할 숫자를 입력 받으면서 동시에 상근이가 가지고 있는지 확인 하는 for문 1개
            test_card[i] = Integer.parseInt(test_line[i]);
            if (sk_card.containsKey(test_card[i])) {
                sb.append(sk_card.get(test_card[i])).append(" ");
            } else {
                sb.append(0).append(" ");
            }

        }

        System.out.println(sb);
        br.close();
    }
}
