package oneD_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class grade_average {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int subject = Integer.parseInt(br.readLine()); //과목 수 입력
        String[] line = br.readLine().split(" ");  //각 성적 입력
        List<Integer>grade = new ArrayList<Integer>();
        for( int i=0;i<subject;i++){  //성적 데이터 전처리
            grade.add(Integer.parseInt(line[i]));
        }
        int most_high_subject = grade.get(0);
        for(int i=1;i<subject;i++){  //최대값 찾기
            if(most_high_subject<grade.get(i)){
                most_high_subject = grade.get(i);
            }
        }
        double sum_grade=0;
        for(int i =0;i<subject;i++){
            sum_grade = sum_grade + grade.get(i);
        }
        bw.write((sum_grade/(most_high_subject*subject)*100)+" ");
        bw.flush();
        bw.close();
        br.close();
    }
}
