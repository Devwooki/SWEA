import java.io.*;
import java.util.*;

public class SWEA_D3_4615_funOSL{
    public static int N, M;
    public static int[][] map;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int TC = Integer.parseInt(br.readLine());
        for(int test = 1 ; test <= TC ; test++){
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            //배열 정 중앙 wb배치
            map = new int[N+1][N+1];
            for(int i = 0  ; i <= N ;++i){
                map[0][i] = -1;
                map[i][0] = -1;
            }
            map[N/2][N/2+1] = 1;
            map[N/2][N/2] =2;
            map[N/2+1][N/2+1] =2;
            map[N/2+1][N/2] =1;

            for(int i = 0 ; i < M ;++i){
                st = new StringTokenizer(br.readLine()," ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                int BW = Integer.parseInt(st.nextToken());  //1흑돌 2백돌
                map[y][x] = BW;

            }
            sb.append("#" + test + " ").append(0).append("\n");
        }
        System.out.print(sb);
    }
    public static void checkCol(int x, int y ,int color){
        if(color == 1){//흑돌
            for(int i = y;  i <=N ; ++i) {
                for(int j = 1;  j <= N ; ++j) {
                    //횡 탐색하면서 1
                }
            }

        }
        else if(color == 2){//백돌돌

        }    }
}