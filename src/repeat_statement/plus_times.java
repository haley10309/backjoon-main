package repeat_statement;


import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class plus_times {  //list 사용해보기 (동적 데이터 저장하는 방법)
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> plus = new ArrayList<Integer>();
        int num = sc.nextInt();
        

        for(int i = 0;i<num;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            plus.add(a+b);
        }
        for(int i = 0;i <num; i++){
            System.out.println(plus.get(i));
        }
        sc.close();
    }
}
