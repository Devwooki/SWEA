import java.io.*;
import java.util.*;

public class SWEA_D3_5212_hamburgerDiet{
    public static int[] score;
    public static int[] kcal;
    public static int N;
    public static int L;
    public static int result;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int TC =  Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i = 1 ; i <= TC ; i++){
            st = new StringTokenizer(br.readLine()," ");
            N = Integer.parseInt(st.nextToken());
            L = Integer.parseInt(st.nextToken());
            score = new int[N];
            kcal = new int[N];

            for(int j = 0 ; j < N ;++j){
                st = new StringTokenizer(br.readLine()," ");
                score[j] = Integer.parseInt(st.nextToken());
                kcal[j] = Integer.parseInt(st.nextToken());
            }
            result =0;
            DFS(0,0,0);
            sb.append("#" + i + " ").append(result).append("\n");
        }
        System.out.print(sb);
    }

    public static void DFS(int sc, int cal, int nodeIndex){
        //score : 0, cal : 1
        if(cal> L) { //햄버거가 칼로리 초과시 종료
            return;
        }if(nodeIndex == N) { //끝까지 탐색했으니 종료
            result = Math.max(sc, result);
            return;
        }

        DFS(sc+score[nodeIndex], cal+kcal[nodeIndex], nodeIndex+1);//재료 사용 했을 때
        DFS(sc, cal, nodeIndex+1);//햄버거 리스트에서 재료 사용 안함

    }
}