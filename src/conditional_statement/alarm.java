package conditional_statement;
import java.util.Scanner;

public class alarm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        
        if(min>=45){
            if(hour>0){
                System.out.println(hour+" "+(min-45));
            }else{
                System.out.println(hour+" "+(min-45)); //0 50분일 때 0은 그대로 출력되어야 함.
            }
        }else{
            if(hour>0){
                System.out.println((hour-1)+" "+(15+min));
            }else{
                System.out.println((23)+" "+(15+min));
            }
            
        }
        sc.close();
    }
}
