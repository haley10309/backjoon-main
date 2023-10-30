package Deepening1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class your_score {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double[] score = new double[20];
        double[] time = new double[20];
        String[] score_standard = new String[]{"A+","A0","B+","B0","C+","C0","D+","D0","F"};
        double[] score_num_stand = new double[]{4.5,4.0,3.5,3.0,2.5,2.0,1.5,1.0,0};
        for(int i=0;i<20;i++){
            String[] line = br.readLine().split(" ");
            time[i] = Double.parseDouble(line[1]); //수업 시간 (학점)
            String score_name = line[2];
            
            for(int j =0;j<9;j++){ //점수 
                if(score_standard[j].equals(score_name)){
                    score[i] = score_num_stand[j];
                }
                if(score_name.equals("P")){
                    time[i]=0.0;
                    score[i] =0.0;
                }
            }
            
        }
        double score_sum =0.0;
        double time_sum =0.0;
        for(int i=0;i<20;i++){
            score_sum = score_sum +(score[i]*time[i]);
            time_sum = time_sum + time[i];
        }
        double gpa = score_sum/time_sum;
        double gpa_up = Math.round(gpa * 1000000)/1000000.0;
        
        bw.write( gpa_up+" ");
        bw.flush();
        bw.close();
        br.close();
    }
}
