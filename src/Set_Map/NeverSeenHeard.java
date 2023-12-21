package Set_Map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class NeverSeenHeard {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String[] line = br.readLine().split(" ");
        int Heard = Integer.parseInt(line[0]);
        int Seen = Integer.parseInt(line[1]);

        HashMap<String, Integer> N_hear = new HashMap<>(); // 듣도 못한 사람
        ArrayList<String> result = new ArrayList<>(); // 듣도 보도 못한 사람들

        for (int i = 0; i < Heard; i++) {
            String text = br.readLine();
            N_hear.put(text, 1);
        }
        for (int i = 0; i < Seen; i++) {
            String text = br.readLine();
            if (N_hear.containsKey(text)) {
                N_hear.replace(text, 2);
            }
        }
        for (Map.Entry<String, Integer> entry : N_hear.entrySet()) {
            if (entry.getValue() == 2) {
                result.add(entry.getKey());
            }
        }

        Collections.sort(result);

        sb.append(result.size()).append(" \n");
        for (int i = 0; i < result.size(); i++) {
            sb.append(result.get(i)).append("\n");
        }
        br.close();
        System.out.println(sb);

    }
}
