package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class age_sort {

    static class Member { 
        int age ;
        String name;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        // int[] age = new int[num];

        // String[] name = new String[num];

        // for (int i = 0; i < num; i++) {
        // String[] line = br.readLine().split(" ");
        // age[i] = Integer.parseInt(line[0]);
        // name[i] = line[1];
        // }
        String[][] judge = new String[num][2];
        Member [] members = new Member[num];
        for (int i = 0; i < num; i++) {
            String[] line = br.readLine().split(" ");
            members[i] = new Member();  //  ** 클래스 사용시 ** 객체 생성 한 번 해야 함. 
            members[i].age = Integer.parseInt(line[0]);
            members[i].name = line[1];

        }
        Arrays.sort(members, new Comparator<Member>() {
            

            @Override
            public int compare(Member o1, Member o2) {
                // TODO Auto-generated method stub
                return  o1.age - o2.age ;
            }
        });
        for(int i = 0 ;i<num ;i++){
            sb.append(members[i].age + " "+ members[i].name).append("\n");
        }
        System.out.println(sb);

    }
}
