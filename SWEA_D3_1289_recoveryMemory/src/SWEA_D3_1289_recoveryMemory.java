
import java.io.*;
import java.util.*;

public class SWEA_D3_1289_recoveryMemory{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int TC = Integer.parseInt(br.readLine());
        for(int i = 1 ; i <= TC ; i++){
            String bit = br.readLine();
            //문자열이 바뀌면 cnt 증가

            int cnt = 0;
            char base = '0';
            for(int j = 0 ; j < bit.length() ; ++j){
                //첫 시작 (0을 기준으로 다르면  cnt++)
                char c = bit.charAt(j);
                if(c != base){
                    base = c;
                    cnt++;
                }

            }
            sb.append("#" + i + " ").append(cnt).append("\n");
        }
        System.out.print(sb);
    }
}