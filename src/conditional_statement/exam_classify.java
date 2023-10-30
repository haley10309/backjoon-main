package conditional_statement;

import java.util.Scanner;

public class exam_classify {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int exam_output = sc.nextInt();

        if(exam_output<60){
            System.out.println("F");
        }else{
            if(exam_output<70){
                System.out.println("D");
            }else{
                if(exam_output<80){
                    System.out.println("C");
                }else{
                    if(exam_output<90){
                        System.out.println("B");
                    }else{
                        System.out.println("A");
                    }
                }
            }
        }
        sc.close();
    }
}
