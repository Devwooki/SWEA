import java.io.*;
import java.util.*;

public class SWEA_D2_1284_waterfee{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int TC = Integer.parseInt(br.readLine());
        for(int i = 1 ; i <= TC ; i++){
            st = new StringTokenizer(br.readLine());
            int P = Integer.parseInt(st.nextToken()); //1리터당 p요금
            int Q = Integer.parseInt(st.nextToken()); //기본 요금 Q
            int R = Integer.parseInt(st.nextToken()); //월간 사용량 R
            int S = Integer.parseInt(st.nextToken()); //초과시 리터당 S 요금
            int W = Integer.parseInt(st.nextToken()); //월 사용한 물의 양

            int comA = P * W;
            int comB = 0;

            if( W < R) comB = Q;
            else comB = Q + (W-R) * S;


            sb.append("#" + i + " ").append(Math.min(comA, comB)).append("\n");
        }
        System.out.print(sb);
    }
}