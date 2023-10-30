package oneD_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class throw_ball {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] line = br.readLine().split(" ");  //바구니 갯수 + 공넣는 방식 갯수 입력 
        int basket_kind = Integer.parseInt(line[0]);
        int throw_kind = Integer.parseInt(line[1]);
        int[] ball_in_basket = new int[basket_kind]; //결과값 저장 변수 배열
        for(int a=0;a<ball_in_basket.length;a++){
            ball_in_basket[a] = 0;
        }

        for(int a=0;a<throw_kind;a++){
            String[] take = br.readLine().split(" ");
            int i = Integer.parseInt(take[0]);
            int j = Integer.parseInt(take[1]);
            int k = Integer.parseInt(take[2]);
            for(int b = i;b<=j;b++){
                ball_in_basket[b-1]=k;
            }
        }
        for(int a=0;a<ball_in_basket.length;a++){
            bw.write(ball_in_basket[a]+" ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
