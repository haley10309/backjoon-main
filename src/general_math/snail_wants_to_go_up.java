package general_math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class snail_wants_to_go_up {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().split(" ");
        int go_up = Integer.parseInt(line[0]);
        int first_day = go_up;
        int come_down = Integer.parseInt(line[1]);
        int tree_length = Integer.parseInt(line[2]);
        int day = 1;
        int meter_per_day = go_up-come_down;

        
        //첫날
        tree_length = tree_length - first_day;
        day = 1;
        int rest_length = tree_length/meter_per_day+((tree_length%meter_per_day ==0)? 0:1); //올림하는 법 Math.ceil 작동 잘 안됨.
        day = day+ rest_length;
        bw.write( day + " ");
        bw.flush();
        bw.close();
        br.close();

    }
}
