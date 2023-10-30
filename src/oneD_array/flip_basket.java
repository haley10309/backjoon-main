package oneD_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class flip_basket {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] line = br.readLine().split(" "); //1.입력 ... 바구니 갯수+ 바꿀 역순 갯수
        int basket_num = Integer.parseInt(line[0]);
        int flip_time = Integer.parseInt(line[1]);
        int[] list = new int[basket_num];
        for(int i=0;i<list.length;i++){ //바구니 순서 초기화
            list[i] =i+1;
        }
        for(int i=0;i<flip_time;i++){
            String[] text = br.readLine().split(" ");
            int start_basket = Integer.parseInt(text[0]);
            int end_basket = Integer.parseInt(text[1]);
            while(start_basket<=end_basket){
                int temp =list[start_basket-1];
                list[start_basket-1] = list [end_basket-1];
                list[end_basket-1] = temp;
                start_basket++;
                end_basket--;
            }

        }
        for(int i=0;i<list.length;i++){
            bw.write(list[i]+" ");
        }
        bw.flush();
        bw.close();
        br.close();


    }
}
