package Set_Map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class Number_Card {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int sangkeun_card_num = Integer.parseInt(br.readLine()); // 상근이가 가지고 있는 카드의 갯수
        HashSet<Integer> sk_list = new HashSet<>(); // 상근이가 가지고 있는 카드  **이걸 써야 정답 
        String[] line = br.readLine().split(" ");
        for (int i = 0; i < sangkeun_card_num; i++) {

            sk_list.add(Integer.parseInt(line[i]));
        }

        int test_num = Integer.parseInt(br.readLine()); // 상근이가 가지고 있는 지 확인할 카드의 갯수
        ArrayList<Integer> test_list = new ArrayList<>(); // 상근이가 가지고 있는 지 확인할 카드
        ArrayList<Integer> result_list = new ArrayList<>(); // 상근이가 가지고 있는지 확인한 결과 리스트
        String[] text = br.readLine().split(" ");
        for (int i = 0; i < test_num; i++) {

            test_list.add(Integer.parseInt(text[i]));
        }

        for (int i = 0; i < test_num; i++) {
            if (sk_list.contains(test_list.get(i))) {
                result_list.add(1);
            } else {
                result_list.add(0);
            }
        }
        for (int i = 0; i < result_list.size(); i++) {
            sb.append(result_list.get(i)).append(" ");
        }
        System.out.println(sb);

    }
}
