import java.io.*;
import java.util.*;

public class SWEA_D3_13547_armFight{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int TC = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < TC ; i++){
            String str = br.readLine();
            boolean win = false;
            //최대 15판의 게임 중 o가 8번 이상일 경우 소정이 승리
            int x_cnt = 0;
            int remainingGame = 15 - str.length();
            for(int j = 0 ; j < str.length() ; ++j){
                if(str.charAt(j) == 'x')
                    x_cnt++;
            }

            if(remainingGame >= 8 || x_cnt <=7)
                win = true;

            if(win) sb.append("#").append(i+1).append(" YES").append("\n");
            else sb.append("#").append(i+1).append(" NO").append("\n");
        }
       System.out.print(sb);
    }
}