package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Word_Sorting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        String[] arr = new String[num];
        for (int i = 0; i < num; i++) {
            arr[i] = br.readLine();
        }
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() != o2.length() ? o1.length() - o2.length() : o1.compareTo(o2);
            }
        });
        sb.append(arr[0]).append("\n");
        for(int i =1 ;i<num ;i++){ //중복되는 문자열은 삭제 ! 
            if(!arr[i].equals(arr[i-1])){
                sb.append(arr[i]).append("\n");
            }
        }
        System.out.println(sb);
    }
}
