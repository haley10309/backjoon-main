package in_out;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("두개의 숫자를 입력하시오");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int output = a+b;
        System.out.println(output);
        scanner.close();
    }
}
