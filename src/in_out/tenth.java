package in_out;
import java.util.Scanner;

public class tenth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();

        int second_one = second % 10;
        int second_ten = ((second - second_one) % 100)/10;
        int second_hundred = ((second - (second_ten*10)-second_one) % 1000)/100;

        System.out.println(first *second_one);
        System.out.println(first * second_ten);
        System.out.println(first * second_hundred);
        System.out.println(first*second);
        sc.close();


    }
}
