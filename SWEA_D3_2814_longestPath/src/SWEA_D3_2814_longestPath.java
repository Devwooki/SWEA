import java.io.*;
import java.util.*;

public class SWEA_D3_2814_longestPath{
    public static ArrayList<Integer>[] list;
    public static boolean[] visited;
    public static int N;
    public static int M;
    public static int max = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;


        int TC = Integer.parseInt(br.readLine());
        for(int i = 1 ; i <= TC ; i++){
            st = new StringTokenizer(br.readLine());

            //정점은 1번부터 N가지 순서대로이며 무방향 그래프
            //같은 정점이 2번이상 등장할 수 없고, 인접한 점 사이에는 간선이 존재
            N = Integer.parseInt(st.nextToken());//정점 수
            M = Integer.parseInt(st.nextToken());//간선 갯수

            list = new  ArrayList[N+1];
            visited = new boolean[N+1];
            max = Integer.MIN_VALUE;

            for(int j = 1 ; j <= N ; ++j){
                list[j] = new ArrayList<Integer>();
            }

            //간선 입력
            for(int j = 0 ; j < M ;++j){
               st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                list[x].add(y);
                list[y].add(x);
            }


            //그래프 최장경로  길이-> 경로를 지나면서 노드의 수 파악
            for(int j = 1 ; j <= N ; ++j){
                DFS(j,1);//각 정점마다 DFS를 실행해 최장경로를 따져아함 -> 방문  초기화
                visited[j] = false;
            }
            sb.append("#" + i + " ").append(max).append("\n");
        }
        System.out.print(sb);
    }

    public static void DFS(int nodeIndex, int len){
        visited[nodeIndex] = true;

        for(int i : list[nodeIndex]){
            if(!visited[i]) {
                DFS(i, len+1);
                visited[i] = false; //검색 마친 정점도 visited했으므로 재귀 종료시 false
            }
        }
        max = Math.max(len, max);

    }
}