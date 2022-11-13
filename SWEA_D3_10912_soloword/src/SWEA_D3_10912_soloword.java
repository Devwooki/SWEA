import java.io.*;
import java.util.*;

public class SWEA_D3_10912_soloword{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int TC = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < TC ; i++){
            int cnt = 0;
            sb.append("#").append(i+1).append(" ");
            String str = br.readLine();
            int[] alpha = new int[26];

            //str의 한 글자씩 alpha배열에 넣음 alpha[0] == a갯수 의미
            for(int j = 0 ; j < str.length() ; ++j){
                char c = str.charAt(j);
                alpha[c-97]++;
            }

            //갯수가 짝수면 없애고  홀수면 1개만 남긴다
            for(int j = 0 ; j < alpha.length ; ++j){
                if(alpha[j]%2 == 0) alpha[j]=0;
                else alpha[j]=1;
            }

            //
            for(int j = 0 ; j < alpha.length ; ++j){
                if(alpha[j] == 0) cnt++;
                else{
                    char c = (char) (j+ 97);
                    sb.append(c);
                }
            }

            if(cnt == 26) sb.append("Good\n");
            else sb.append("\n");
        }
        System.out.print(sb);
    }
}