import java.io.*;
import java.util.*;

public class SWEA_D3_14413_paintingGridboard{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int TC = Integer.parseInt(br.readLine());

        /*
        #인덱스합 짝수 = idx1<-> .인덱스합 홀수 idx2 -> possible
        #인덱스합 홀수 = idx3<-> .인덱스합 짝수 idx4 -> possible
        =>  이외의 조합은 impossible
         */
        for(int i = 0 ; i < TC ; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            String[] gridBoard = new String[N];
            boolean[] board = {false, false, false, false};
            //배열 초기화
            for(int j = 0 ; j < N ; ++j){
                gridBoard[j] = br.readLine();
            }

            for(int j = 0 ; j < N ; ++j){
                for(int k = 0 ; k < M ; ++k){
                    char c = gridBoard[j].charAt(k);
                    switch(c){
                        case '#' :  //#의 인덱스합이 짝수 ☆
                            if((j+k)%2 == 0)
                                board[0] = true;
                            else    //#의 인덱스합이 홀수 ★
                                board[2] = true;
                            break;
                        case '.':   //.의 인덱스합이 홀수 ☆
                            if((j+k)%2 == 1)
                                board[1] = true;
                            else    //.의 인덱스합이 짝수 ★
                                board[3] = true;
                            break;
                    }
                }
            }
            //0 : #짝 <-> 1 :. 홀 | 2 : #홀  <-> 3 :. 짝
            //0과2동시에 존재, 0과3동시에 존재
            //1과3동시에 존재, 1과2동시에 존재  -> impossible
            if((board[0] && board[2]) || (board[0] && board[3])
                || (board[1] && board[3]) || (board[1] && board[2]))
                sb.append("#").append(i+1).append(" ").append("impossible").append("\n");
            else
                sb.append("#").append(i+1).append(" ").append("possible").append("\n");
        }
        System.out.print(sb);
    }
}