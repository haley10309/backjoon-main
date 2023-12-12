package Set_Map;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class String_set {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] line = br.readLine().split(" ");

        int S_num = Integer.parseInt(line[0]);
        int test_num = Integer.parseInt(line[1]);

        HashSet<String> S_word = new HashSet<>();
        ArrayList<String> T_word = new ArrayList<>();
        int result = 0;
        for (int i = 0; i < S_num; i++) { // N 집합 받는 for 문
            String text = br.readLine();
            S_word.add(text);
        }
        for (int i = 0; i < test_num; i++) { // M집합 받는 for문
            String text = br.readLine();
            T_word.add(text);
        }
        for(int i = 0 ; i< test_num ;i++){
            if(S_word.contains(T_word.get(i))){
                result++;
            }
        }
        sb.append(result).append(" ");
        System.out.println(sb);

    }
}
