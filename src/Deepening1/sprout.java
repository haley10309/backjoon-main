package Deepening1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class sprout {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("         ,r'\"7" + "\n");
        bw.write("r`-_   ,'  ,/" + "\n");
        bw.write(" \\. \". L_r'" + "\n");
        bw.write("   `~\\/" + "\n");
        bw.write("      |" + "\n");
        bw.write("      |" + "\n");
        bw.flush();
        bw.close();

    }//중요한 건 큰따옴표 " " 출력할 때는 \" 이렇게 역슬래시 붙일 것
    // 이렇게 역슬래시\출력할 때는 \\두개 붙일 것. (역슬래시 하나는 없어진다고 생각)
}
