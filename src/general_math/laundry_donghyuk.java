package general_math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class laundry_donghyuk {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;

        int test_case = Integer.parseInt(br.readLine());
        for (int i = 0; i < test_case; i++) {
            int change = Integer.parseInt(br.readLine());
            int count = 0;
            int quarter_count = 0;
            int dime_count = 0;
            int nickel_count = 0;
            int penny_count = 0;
            while (true) {
                if (((quarter_count * quarter) <= change) && (change < (quarter * (quarter_count + 1)))) {
                    bw.write(quarter_count + " ");
                    change = change - (quarter_count * quarter);
                    break;
                }
                quarter_count++;
            }
            while (true) {
                if (((dime_count * dime) <= change) && (change < (dime * (dime_count + 1)))) {
                    bw.write(dime_count + " ");
                    change = change - (dime_count * dime);
                    break;
                }
                dime_count++;
            }
            while (true) {
                if (((nickel_count * nickel) <= change) && (change < (nickel * (nickel_count + 1)))) {
                    bw.write(nickel_count + " ");
                    change = change - (nickel_count * nickel);
                    break;
                }
                nickel_count++;
            }
            while (true) {
                if (((penny_count * penny) <= change) && (change < (penny * (penny_count + 1)))) {
                    bw.write(penny_count + " \n");
                    change = change - (penny_count * penny);
                    break;
                }
                penny_count++;
            }

        }
        bw.flush();
        bw.close();
        br.close();
    }
}
