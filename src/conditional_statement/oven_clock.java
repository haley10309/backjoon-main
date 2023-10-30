package conditional_statement;

import java.util.Scanner;

public class oven_clock {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int spend_time = sc.nextInt();
        int spend_hour = spend_time/60;
        int spend_min = spend_time - (spend_hour*60);

        int print_hour = (hour+((min+spend_time)/60))%24;
        int print_min = (min+spend_min)%60;
        
        if(hour==23){
            if((min+spend_time)>=60){
                System.out.println((spend_hour)+" "+(print_min));

            }
            else{
                System.out.println(hour+" "+(print_min));
            }

        }else{
            if((min+spend_time)>=60){
                if((hour+spend_hour)>23){
                    System.out.println(((print_hour))+" "+(print_min));
                }else{
                    System.out.println((print_hour)+" "+((print_min)));
                }
                

            }
            else{
                System.out.println(print_hour+" "+(print_min));
            }
        }
        sc.close();
    }
}
