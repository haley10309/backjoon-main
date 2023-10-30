package repeat_statement;
import java.util.Scanner;


public class codingIs_PE {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long data = sc.nextLong();

        long num = data/4;

        for(int i=0;i<num; i++){
            System.out.print("long ");
        }
        System.out.print("int");
        sc.close();
    }
}
