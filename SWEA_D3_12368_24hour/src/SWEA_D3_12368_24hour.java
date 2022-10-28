import java.io.*;
import java.util.*;

public class SWEA_D3_12368_24hour  {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int TC = Integer.parseInt(br.readLine());

        // 자정을 표기하는 유일한 방법은 “0시”임에 유의하라.
        for(int i = 0 ; i < TC ; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if((A+B) > 23) sb.append("#").append(i+1).append(" ").append((A+B)-24).append("\n");
            else sb.append("#").append(i+1).append(" ").append((A+B)).append("\n");
        }
        System.out.println(sb);
    }
}