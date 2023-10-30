package conditional_statement;
import java.util.Scanner;

public class leap_year {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean f_time = false; //4의 배수 여부
        boolean h_time = false; //100의 배수 여부
        boolean fh_time = false; //400의 배수 여부

        if((year%4)==0){//4의 배수 인지
            f_time=true;
        }
        if((year%100)==0){ //100의 배수가 아닌지
            h_time = true;
        }
        if((year%400)==0){ //400의 배수가 맞는지
            fh_time = true;
        }

        if(((f_time==true)&&(h_time==false))||(fh_time==true)){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
        sc.close();
        }

    }

