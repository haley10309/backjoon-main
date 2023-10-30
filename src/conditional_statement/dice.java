package conditional_statement;

import java.util.Scanner;

public class dice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f_num = sc.nextInt();
        int s_num = sc.nextInt();
        int t_num = sc.nextInt();
        int equal_count = 0;
        int Big_num = 0;

        if (f_num == s_num) { //첫 번째와 두번째가 같을 때 1 = 2 
            if (f_num == t_num) {// 3개의 눈이 모두 같을 때  1 = 2 = 3 
                equal_count = 2; 
                Big_num = f_num;
            } else {     // 첫 번째와 두번째만 같을 때 1 = 2 != 3
                equal_count = 1; 
                Big_num = f_num;
            }
        } else {    // 첫 번째와 두 번째가 다를 때  1 != 2
            if (f_num == t_num) {// 첫번 째와 세번째만 같을 때 3 = 1 != 2
                equal_count = 1; 
                Big_num = f_num;
            } else {             
                if(s_num == t_num){  //두 번째와 세 번째만 같을 때 1 != 2 = 3
                    equal_count =1;
                    Big_num = s_num;
                }else{                //모두 다를 때 1 != 2 != 3
                    equal_count = 0; 
                }
                
            }

        }

        if (equal_count == 0) { // 모두 다른 눈이 나오는 경우
            if (f_num > s_num) {  //그중 가장 큰 눈을 찾는 과정
                Big_num = f_num;
                if (Big_num > t_num) {
                    System.out.println((Big_num * 100));
                } else {
                    System.out.println(t_num * 100);
                }
            } else {
                Big_num = s_num;
                if (Big_num > t_num) {
                    System.out.println((Big_num * 100));
                } else {
                    System.out.println(t_num * 100);
                }
            }                       //그 중 가장 큰 눈 찾는 과정 끝 --- 
            
        } else {
            if (equal_count == 1) {
                System.out.println(1000 + (Big_num * 100));
            }else{
                System.out.println(10000+(Big_num*1000));
            }
        }
        sc.close();
    }
}
