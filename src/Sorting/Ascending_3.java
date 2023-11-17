package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ascending_3 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        //ArrayList<Integer> list = new ArrayList<>(); //리스트로 하니까 틀리고 배열로 하니까 맞음. 
        

        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];

        for(int i =0 ;i<num ;i++){  //숫자 입력 받기
            //list.add(Integer.parseInt(br.readLine()));
            arr[i] = Integer.parseInt(br.readLine());
        }
        // Collections.sort(list);
        // for(int value : list){
        //     sb.append(value).append("\n");
        // }
        Arrays.sort(arr);
        for(int value : arr){
            sb.append(value).append("\n");
        }
        System.out.println(sb);

    }
}
