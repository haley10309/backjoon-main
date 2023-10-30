package conditional_statement;

import java.util.Scanner;

public class quadrant {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();

        if((x>0)&&(y>0)){
            System.out.println("1");
        }else{
            if((x<0)&&(y>0)){
                System.out.println("2");
            }else{
                if((x<0)&&(y<0)){
                    System.out.println("3");
                }else{
                    System.out.println("4");
                }
            }
        }
        sc.close();
    }
}
