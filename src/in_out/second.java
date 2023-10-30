package in_out;
import java.util.Scanner;

public class second {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //사용자 명정 system.out 넣지 말기
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int output = a+b;
        System.out.println(output);
        scanner.close();
    }
}
