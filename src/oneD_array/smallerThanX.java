package oneD_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class smallerThanX {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> num_list = new ArrayList<Integer>();

        String[] arr = br.readLine().split(" ");
        int whole = Integer.parseInt(arr[0]);
        int target = Integer.parseInt(arr[1]);
        String[] line = br.readLine().split(" ");
        for(int i=0;i<whole;i++){
            num_list.add(Integer.parseInt(line[i]));
        }
        for(int i=0;i<whole;i++){
            if(num_list.get(i) < target){
                bw.write(num_list.get(i)+" ");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
