package oneD_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class mostSmallBig {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> num_list = new ArrayList<Integer>();

        int whole = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        for (int i = 0; i < whole; i++) {
            num_list.add(Integer.parseInt(line[i]));
        }
        int most_small = num_list.get(0);
        int most_big = num_list.get(0);
        for (int i = 1; i < whole; i++) {

            if (num_list.get(i) > most_big) {
                most_big = num_list.get(i);
            }
            if (num_list.get(i) < most_small) {
                most_small = num_list.get(i);
            }

        }
        bw.write(most_small + " " + most_big);
        bw.flush();
        bw.close();
        br.close();
    }
}
