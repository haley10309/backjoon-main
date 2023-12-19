package Set_Map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Pokemon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] first_line = br.readLine().split(" ");
        int pokemon_num = Integer.parseInt(first_line[0]);
        int test_num = Integer.parseInt(first_line[1]);
        HashMap<String, Integer> encyclopedia = new HashMap<>(); //도감
        ArrayList<String> name = new ArrayList<>();
        for (int i = 0; i < pokemon_num; i++) { // 도감 입력 받기
            String text = br.readLine();
            encyclopedia.put(text, i);
            name.add(text);
        }
        for (int i = 0; i < test_num; i++) { // 문제 입력 받기
            String text = br.readLine();
            if(isInteger(text)){  //숫자가 들어왔을 때
                sb.append(name.get(Integer.parseInt(text)-1)).append("\n");
            }else{
            //     encyclopedia.forEach((key,value)->{ // for문을 돌리는 것과 같아서 시간 초과 ***
            //         if(value.equals(text)){
            //             sb.append(key+1).append("\n");
            //         }
            //     });
                sb.append(encyclopedia.get(text)+1).append("\n");
            }
        }
        System.out.println(sb);
        br.close();
    }
    public static boolean isInteger(String strValue){
        try{
            Integer.parseInt(strValue);
            return true;
        }catch(NumberFormatException ex){
            return false;
        }
        
    }
}
