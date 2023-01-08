import java.io.*;
import java.util.*;

//배열을 90도 180도 270도 회전한 모양 출력
public class SWEA_D2_1961_rotateArray{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int TC = Integer.parseInt(br.readLine());
        for(int i = 1 ; i <= TC ; i++){
            int N = Integer.parseInt(br.readLine());
            int[][] arr = new int[N][N];
            sb.append("#" + i + "\n");
            //배열 초기화
            for(int j = 0 ; j < N ; ++j){
                st = new StringTokenizer(br.readLine());
                for(int k = 0 ; k < N ; ++k){
                    arr[j][k] = Integer.parseInt(st.nextToken());
                }
            }
            int[][] arr90 = Rotation(arr,N);
            int[][] arr180 = Rotation(arr90,N);
            int[][] arr270 = Rotation(arr180,N);

            for(int j = 0 ; j < N ; ++j){
                for(int k = 0 ; k < N ; ++k){
                    sb.append(arr90[j][k]);
                }
                sb.append(" ");
                for(int k = 0 ; k < N ; ++k){
                    sb.append(arr180[j][k]);
                }
                sb.append(" ");
                for(int k = 0 ; k < N ; ++k){
                    sb.append(arr270[j][k]);
                }
                sb.append("\n");
            }

        }
        System.out.println(sb);
    }
    public static int[][] Rotation(int[][] arr,int N){
        int[][] result = new int[N][N];

        for(int i = 0 ; i < N ; ++i){
            for(int j = 0 ; j < N ; ++j){
                result[i][j] = arr[N-1-j][i];
            }
        }
        return result;
    }
}