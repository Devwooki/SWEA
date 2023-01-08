import java.io.*;
import java.util.*;

public class SWEA_D3_1209_sum{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for(int i = 1 ; i <= 1 ; i++){
            br.readLine();

            int[][] arr = new int[100][100];
            int sumR = 0;
            int sumC = 0;
            int sumRdia = 0;
            int sumLdia = 0;
            int max = Integer.MIN_VALUE;
            //배열 초기화
            for(int j = 0 ; j < 100; ++j){
                st = new StringTokenizer(br.readLine()," ");
                for(int k = 0 ; k < 100; ++k){
                    arr[j][k] = Integer.parseInt(st.nextToken());
                }
            }
            for(int k = 0 ; k < 100; ++k){
                sumLdia += arr[k][k];
            }

            for(int k = 0 ; k < 100; ++k){
                sumRdia += arr[k][99-k];
            }

            for(int j = 0 ; j < 100; ++j){
                for(int k = 0 ; k < 100; ++k){
                    sumR += arr[j][k];
                    sumC += arr[k][j];
                }
                max =  Math.max(max, Math.max(sumR,sumC));
                sumR = 0;
                sumC = 0;
            }

            max = Math.max(max, Math.max(sumRdia, sumLdia));

            sb.append("#" + i + " ").append(max).append("\n");
        }
        System.out.print(sb);
    }
}