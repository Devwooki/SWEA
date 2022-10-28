import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new  StringBuilder();
        StringTokenizer  st;

        int[] arr = new int[101];
        int mode = Integer.MIN_VALUE;

        int TC = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < TC ; i++){
            br.readLine(); //처음꺼 스킵
            st = new StringTokenizer(br.readLine(), " ");
            Arrays.fill(arr, 0); // 새로운 TC마다 배열값 0으로 초기화

            while(st.hasMoreTokens()){
                int num =  Integer.parseInt(st.nextToken());
                arr[num]++;
            }


            for(int j = 1 ; j<101 ; j++){
                if(mode < arr[j]) mode = arr[j];
            }
            sb.append("#").append(i+1).append(" ").append(Arrays.asList(arr).indexOf(mode)).append("\n");
        }


        System.out.println(sb);
    }
}