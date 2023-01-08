
import java.io.*;
import java.util.*;

public class SWEA_D3_2805_getOats{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int TC = Integer.parseInt(br.readLine());
        for(int i = 1 ; i <= TC ; i++){
            int N = Integer.parseInt(br.readLine());
            int[][] map =  new int[N][N];
            for(int j = 0 ; j < N  ; ++j){
                String str = br.readLine() + " ";
                for(int k = 0 ; k < N  ; ++k){
                    map[j][k] = Integer.parseInt(str.substring(k, k+1));
                }
            }

            int sum = 0;
            int mid = N/2;

            for(int j = 0 ; j <= mid  ; ++j){
                for(int k = mid-j; k < N-(mid-j)  ; ++k){
                   sum += map[j][k];
                }
                /*
                j =  2
                k = 2 - 2 = 0
                n-mid+j = 5-2+2 = 5

                j =  3 -> 1~3
                k = 2 - 3 = -1
                n-mid+j = 5+2-3 =  4

                j = 4
                k  = 2 - 4 = -2
                n-mid+j = 5+2-4 = 7// 3
                 */
            }
            for(int j = mid+1 ; j < N  ; ++j){
                for(int k = Math.abs(mid-j); k < N+mid-j; ++k){
                    sum += map[j][k];
                }
            }
            sb.append("#" + i + " ").append(sum).append("\n");
        }
        System.out.print(sb);
    }
}
