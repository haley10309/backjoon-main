package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Coodinate_compression {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num]; // original
        int[] arr_sort = new int[num]; // sorted array
        
        HashMap<Integer, Integer> rankingmap = new HashMap<Integer, Integer>();
        String[] line = br.readLine().split(" ");
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(line[i]);
            arr_sort[i] = Integer.parseInt(line[i]);
        }
        Arrays.sort(arr_sort); // 복사값만 정렬
        int rank = 0;
        for( int v : arr_sort){
            if(!rankingmap.containsKey(v)){
                rankingmap.put(v, rank);
                rank++;
            }
        }
        for(int key : arr){
            int ranking = rankingmap.get(key);
            sb.append(ranking).append(" ");
        }
        System.out.println(sb);

       
    }
}
