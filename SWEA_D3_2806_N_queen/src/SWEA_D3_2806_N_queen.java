import java.io.*;
import java.util.*;

public class SWEA_D3_2806_N_queen{
    public static int[] board;
    public static int N;
    public static int cnt;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int TC = Integer.parseInt(br.readLine());
        for(int i = 1 ; i <= 1 ; i++){
            cnt = 0;
            N = Integer.parseInt(br.readLine());
            board = new int[N];
            nQueen(0);
            sb.append("#" + i + " ").append(cnt).append("\n");

        }
        System.out.print(sb);
    }

    //재귀 호출함수
    //1차원배열로 가능함 -> 1차원 배열 idx열, 값을 행
    //첫 번째 열 부터 한개씩 채울 수 있으면  재귀호출로  다채우기
    public static void nQueen(int depth){
        if(depth ==N){
            cnt++;
            return;
        }
        for(int i = 0 ; i < N ;++i){
            //첫 번째 열의 행의 값 찾고, 두 번째 열의 행의 값 찾고...  반복
            board[depth] = i;
            if(possiblity(depth)){
                nQueen(depth+1);
            }

        }
    }

    //놓을 위치가 다른퀸으로 부터 위협받는지 확인
    public static boolean possiblity(int col){
        //idx가 열이니, 열 검사가 필요 없음
        for(int i = 0 ; i< col ; ++i){
            //해당 열의 행과, i열의 행이 일치하면(같은 행이 있을경우 종료
            if(board[col] == board[i]) return false;
            /*
            대각선에 놓는 경우 -> 열의차와 행의 차가 같으면 대각선에 있음)
            EX (2,3)에 하나 (1,2)에 있다고 하면 열의차 1, 행의차 1-> 대각 선  위치에 존재함
             */
            else if( Math.abs(col-i) == Math.abs(board[col] - board[i]))
                return false;
        }
        return true;
    }
}