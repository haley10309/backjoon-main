package in_out;

import java.util.Scanner;

public class eighth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ThaiYear = sc.nextInt();
        int year = ThaiYear - 543;
        System.out.println(year);
        sc.close();
    }
}
