package repeat_statement;

import java.util.Scanner;


public class receipt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        
        long total = sc.nextLong(); //사용자가 입력하는 전체 합계
        int kind = sc.nextInt();
        long exact_total =0;

        for(int i =0;i<kind ;i++){
            long input_price = sc.nextLong();
            int input_num = sc.nextInt();
            exact_total = exact_total+(input_num*input_price);
        }
        if(exact_total==total){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }
}
