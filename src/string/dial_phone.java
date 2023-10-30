package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class dial_phone { //포함 여부 확인 함수 사용 하기
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String two = "ABC";
        String three = "DEF";
        String four = "GHI";
        String five = "JKL";
        String six = "MNO";
        String seven = "PQRS";
        String eight = "TUV";
        String nine = "WXYZ";

        int time =0;
        String line = br.readLine();
        for(int i =0 ;i<line.length();i++){
            if(two.indexOf(line.charAt(i))>-1){
                time = time+ 3;
            }
            if(three.indexOf(line.charAt(i))>-1){
                time = time+ 4;
            }
            if(four.indexOf(line.charAt(i))>-1){
                time = time+ 5;
            }
            if(five.indexOf(line.charAt(i))>-1){
                time = time+ 6;
            }
            if(six.indexOf(line.charAt(i))>-1){
                time = time+ 7;
            }
            if(seven.indexOf(line.charAt(i))>-1){
                time = time+ 8;
            }
            if(eight.indexOf(line.charAt(i))>-1){
                time = time+ 9;
            }
            if(nine.indexOf(line.charAt(i))>-1){
                time = time+ 10;
            }
            
            
        }
        bw.write(time+" ");
        bw.flush();
        bw.close();
        br.close();
    }
}
