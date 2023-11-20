package Sorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class Sort_inside {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String line = br.readLine();
        Integer [] num = new Integer [line.length()];
        for(int i= 0; i<line.length();i++){
            num[i] = line.charAt(i)-'0';

        }
        Arrays.sort(num,Collections.reverseOrder());
        for(int value : num ){
            sb.append(value).append("");
        }
        System.out.println(sb);

    }
}
