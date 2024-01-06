package Set_Map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Differerece_Set {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] line = br.readLine().split(" "); // 첫번째와 두번째 숫자들의 갯수
        int first_num = Integer.parseInt(line[0]);
        int second_num = Integer.parseInt(line[1]);

        
        Set<Integer> setA = new HashSet<>(); //hashset 안쓰면 틀림! 
        int difference = 0;
        String[] text = br.readLine().split(" ");
         for (int i = 0; i < first_num; i++) {

            setA.add( Integer.parseInt(text[i]));
        }
        /* 두번째 숫자들 입력 받으면서 차집합 있는지 검사 */
        String[] text_second = br.readLine().split(" "); // 두번째 숫자들 입력 받기
        for (int i = 0; i < second_num; i++) {
            if (setA.contains(Integer.parseInt(text_second[i]))) {
                difference++;
            }

        }


        int result = first_num + second_num - (difference * 2);
        sb.append(result + " ");
        System.out.println(sb);
    }
}
