import java.io.*;
import java.util.*;

public class SWEA_D2_1288_sheepCNT{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int TC = Integer.parseInt(br.readLine());
        for(int i = 1 ; i <= TC ; i++){
            int N = Integer.parseInt(br.readLine());
            boolean[] check = new boolean[10]; //0 ~ 9까지 배열
            int k = 1;

            while(true){
                String kN_str = String.valueOf(k*N); //k * N을 문자화
                int cnt = 0;

                for(int j= 0 ; j < kN_str.length() ;++j){
                    check[Integer.parseInt(String.valueOf(kN_str.charAt(j)))] = true;
                }
                for(int j = 0 ; j < 10 ; j++){
                    if(check[j]) cnt++;
                    else break;
                }
                if(cnt==10) break; //0 ~ 9까지 있으면 while종료
                else k++; //없으면 k를 증가시켜 다시 연산
            }
            sb.append("#" + i + " ").append((k*N)).append("\n");
        }
        System.out.print(sb);
    }
}