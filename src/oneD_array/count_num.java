package oneD_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class count_num {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List <Integer> num_list = new ArrayList<Integer>();
        int output = 0;
        int num = Integer.parseInt(br.readLine());  //첫 번째 입력
        String[] arr = br.readLine().split(" ");  //두 번째 입력
        for(int i =0;i<num;i++){
            num_list.add(Integer.parseInt(arr[i]));
        }
        int target_num = Integer.parseInt(br.readLine());  //세 번째 입력


        for(int i =0;i<num;i++){
            if(num_list.get(i)==target_num){
                output ++;
            }
        }
        //System.out.println(output);
        bw.write(output+"\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
