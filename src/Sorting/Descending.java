package Sorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Descending {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        int test_num = Integer.parseInt(br.readLine());
        for(int i=0 ;i<test_num ;i++){
            list.add(Integer.parseInt(br.readLine()));
            
        }
        Collections.sort(list);
        for(int value : list){
            sb.append(value ).append("\n");
        }
       System.out.println(sb);

    }
}
