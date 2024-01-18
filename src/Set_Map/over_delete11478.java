package Set_Map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class over_delete11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine(); // 문자열
        ArrayList<String> list = new ArrayList<>(); // 중복을 제거한 부분 문자열

        for (int i = 0; i <= line.length(); i++) { // 
            for(int j = 0 ;j<=i;j++){
                list.add(line.substring(j,i));
            }
        }
        Set<String> set = new HashSet<>(list);
        List<String> newlist = new ArrayList<>(set);
        sb.append(newlist.size()-1).append(" ");
        System.out.println(sb);
    }
}
