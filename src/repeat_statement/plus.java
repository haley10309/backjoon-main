package repeat_statement;

import java.util.Scanner;

public class plus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int total = 0;

        for(int i=1; i<=num;i++){
            total = total +i;
        }

        System.out.println(total);
        sc.close();
    }
}
