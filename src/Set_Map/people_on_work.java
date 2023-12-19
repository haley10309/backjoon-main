package Set_Map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class people_on_work {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        
        HashMap<String, String> search = new HashMap<>();// 입장, 퇴장 리스트

        for (int i = 0; i < num; i++) {
            String[] input_text = br.readLine().split(" ");

            if (search.containsKey(input_text[0])) {
                search.replace(input_text[0], input_text[1]);
            } else {
                search.put(input_text[0], input_text[1]);
                
            }

        }
        
        ArrayList<String> remain_people = new ArrayList<>(); // 아직 남아있는 사람
        
        search.forEach((key, value) -> { //남아있는 사람 검색 -> 특정 조건 key 만 가져오기 -> arraylist 에 add 시킴 
            if(value.equals("enter")){
                remain_people.add(key);
            }
        });
        int size = 0 ;
        int result_count =remain_people.size();
        String[] result = new String[result_count];
        for(String temp : remain_people){   // arraylist 를 배열로 바꾸기 ++이 중요함. 
            result[size++] = temp;
        }
        Arrays.sort(result, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {  //사전 역순으로 정렬 
                //단어 길이가 같은 경우 소문자 먼저 
                // if(o1.length() == o2.length()){
                //     return o2.compareTo(o1);
                // }else{
                //     return o2.length() - o1.length();
                // }
                 return  o2.compareTo(o1);
            }
            
        }); //사전의 역순 정렬
        
        for(String value : result){
            sb.append(value).append("\n");
        }
        System.out.println(sb);

    }
}
