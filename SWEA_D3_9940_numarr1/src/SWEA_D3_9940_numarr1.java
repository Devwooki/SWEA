import java.io.*;
import java.util.*;

public class SWEA_D3_9940_numarr1{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int TC = Integer.parseInt(br.readLine());
        for(int test = 1 ; test <= TC ; test++){
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            st = new StringTokenizer(br.readLine()," ");
            for(int i = 0 ; i < N ; ++i){
                int x = Integer.parseInt(st.nextToken());
                arr[i] = x;
            }
            Arrays.sort(arr);
            boolean flag = true;
            for(int i = 1 ; i <= N ; ++i){
                if(arr[i-1] != i){
                    flag = false;
                    break;
                }
            }
            if(flag) sb.append("#" + test + " ").append("Yes").append("\n");
            else sb.append("#" + test + " ").append("No").append("\n");

        }
        System.out.print(sb);
    }
}