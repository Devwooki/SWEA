import java.io.*;
import java.util.*;

public class SWEA_D3_3282_01Knapsack{
    public static int[] V,C;
    public static int N,K;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int TC = Integer.parseInt(br.readLine());
        for(int test = 1 ; test <= TC ; test++){
            st = new StringTokenizer(br.readLine()," ");
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            V =  new int[N]; //부피 저장
            C =  new int[N]; //가치 저장
            //가방에 몇개 선택해서  가치의 합을 최대화 하려고 함, 부피의 합은  K이하

            //물건들 입력
            for(int i = 0 ; i < N ; ++i){
                st = new StringTokenizer(br.readLine()," ");
                int vi = Integer.parseInt(st.nextToken());
                int ci = Integer.parseInt(st.nextToken());
                V[i] = vi;
                C[i] = ci;
            }

            DFS(0,0,0);
            sb.append("#" + test + " ").append(0).append("\n");
        }
        System.out.print(sb);
    }
    public static void DFS(int v, int c, int idx){
        if()

        if(v <= K) DFS(v+V[idx], c+C[idx], idx+1);
        else DFS(v, c, idx+1);
    }

}