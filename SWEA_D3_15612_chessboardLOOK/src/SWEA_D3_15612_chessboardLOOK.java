import java.io.*;
import java.util.*;

public class SWEA_D3_15612_chessboardLOOK{
    public static int size = 8;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int TC = Integer.parseInt(br.readLine());
        String[] board = new String[size];

        for(int i = 0 ; i < TC ; i++){
            //배열 초기화
            for(int k = 0 ; k < size ; ++k){
                board[k] = br.readLine();
            }
            //룩은 8개
            //모든 룩은 서로를 죽일 수 없음

            boolean killRow = false;
            boolean killCol = false;
            int rookcnt = 0;
            for(int j = 0 ; j < size ; ++j){
                int rowcnt = 0;
                int colcnt = 0;
                for(int k = 0 ; k< size ; ++k){
                    char c_row = board[j].charAt(k);
                    char c_col = board[k].charAt(j);
                    if(c_row == 'O') rowcnt++; //횡 검색하며 O발면하면 rowcnt++
                    if(c_col == 'O') colcnt++; //열 검색하며 O발견하면 colcnt++
                    if(rowcnt >= 2 || colcnt>=2){//
                        killRow= killCol = true;
                    }
                }
                rookcnt +=  rowcnt;
            }
            //8개 이고 죽일 수 없을 때
            if( (!killCol && !killRow) && rookcnt == 8){
                sb.append("#").append(i+1).append(" ").append("yes").append("\n");
            }else{
                sb.append("#").append(i+1).append(" ").append("no").append("\n");
            }

        }
        System.out.print(sb);
    }
}