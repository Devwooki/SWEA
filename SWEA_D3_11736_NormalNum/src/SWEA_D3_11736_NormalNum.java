//import java.io.*;
//import java.util.*;
//
//public class SWEA_D3_11736_NormalNum{
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        StringTokenizer st;
//        int TC = Integer.parseInt(br.readLine());
//        for(int i = 0 ; i < TC ; i++){
//            int N = Integer.parseInt(br.readLine());
//
//            //배열 초기화
//            int[] arr =  new int[N];
//            st = new StringTokenizer(br.readLine()," ");
//            for(int j = 0 ; j < N ; ++j){
//
//                arr[j] = Integer.parseInt(st.nextToken());
//            }
//            int result =0;
//
//            //최댓값 최솟값 지정
//
//
//            // p-1 ~ p+1에서 최댓값, 최솟값이 아니라면 평범한 숫자
//            for(int j = 1 ; j < N-1 ; ++j){
//                int max = Math.max(Math.max(arr[j-1],arr[j]),arr[j+1]);
//                int min = Math.min(Math.min(arr[j-1],arr[j]),arr[j+1]);
//
//                if(arr[j] != max && arr[j] != min) result++;
//            }
//
//            sb.append("#" + (i+1) + " ").append(result).append("\n");
//
//        }
//        System.out.print(sb);
//    }
//}

import java.io.*;
import java.util.*;

public class SWEA_D3_11736_NormalNum{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int TC = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < TC ; i++){
            int N = Integer.parseInt(br.readLine());
            boolean isCan = false;
            for(int j =  1; j < 10 ; ++j){
                if(isCan) break;
                for(int k =  1; k < 10 ; ++k){
                    //System.out.println(j + ", " + k + "=" + (j*k));
                    if(j*k == N){
                        isCan = true;
                        break;
                    }
                }
            }

            if(isCan) sb.append("#" + (i+1) + " ").append(" Yes").append("\n");
            else sb.append("#" + (i+1) + " ").append(" No").append("\n");

        }
        System.out.print(sb);
    }
}