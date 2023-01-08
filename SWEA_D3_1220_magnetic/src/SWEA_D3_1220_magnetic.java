import java.io.*;
import java.util.*;

public class SWEA_D3_1220_magnetic{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for(int i = 1 ; i <= 10 ; i++) {
            int N = Integer.parseInt(br.readLine()); //100으로 고정임
            int[][] table = new int[N][N];
            for (int j = 0; j < N; ++j) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int k = 0; k < N; ++k) {
                    table[j][k] = Integer.parseInt(st.nextToken());
                    ;
                }
            }

            //순서가 12일 때만
            int cnt = 0;
            for (int j = 0; j < N; ++j) {
                boolean isDeadLock = false;
                for (int k = 0; k < N; ++k) {
                    if (table[k][j] == 1)
                        isDeadLock = true;
                    else if (table[k][j] == 2 && isDeadLock) {
                        cnt++;
                        isDeadLock = false;
                    }
                }
            }

            //안되는 이유 111221 일때  12끝나고 2시작하므로 21은 cnt불가함
//            for(int j = 0  ; j < N ; ++j){
//                boolean isN = false;
//                boolean isS = false;
//                for(int k = 0  ; k < N ; ++k){
//                    if(table[j][k] == 1)
//                        isN = false;
//                    else if(table[j][k] == 2){
//                        isS = false;
//                    }
//                    if(isN && isS){
//                          cnt++;
//                          isN=false;
//                          isS=false;
//                    }
//                }
//            }
            sb.append("#" + i + " ").append(cnt).append("\n");
        }
        System.out.print(sb);
    }
}
