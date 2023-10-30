package in_out;

import java.util.Scanner;
public class fifth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt(); // 1 -> 1.0으로 입력되어야 나눴을 때도 유리수로 나옴
        double b = sc.nextInt();
        double c = a/b;
        System.out.println(c);
        sc.close();

    }
}
