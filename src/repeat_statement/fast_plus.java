package repeat_statement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class fast_plus {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));
        List<Integer> add_out = new ArrayList<Integer>();

        int num = Integer.parseInt(bf.readLine());

        for (int i = 0; i < num; i++) {
            String[] arr = bf.readLine().split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            add_out.add(a + b);
            bw.write(a + b + "\n");
        }

        bf.close();
        bw.flush(); // bufferWrite 는 한 곳에 써서 flush 하면 전부 내보내는 형식
        bw.close();
    }
}
