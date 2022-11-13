import java.io.*;
import java.util.*;

public class SWEA_D3_14178_1Dpark{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int TC = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < TC ; i++){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int D = Integer.parseInt(st.nextToken());

            int range = 2*D+1; //[x-D, x+D] -> 2D + 1과 같음
            int result = N/range;

            //N%range == 0 -> N이 range에 나눠 떨어지면 result가 결과
            //N%range != 0 -> 분무기를 하나 더 설치 해야하므로 result + 1
            if(N%range == 0)
                sb.append("#").append(i+1).append(" ").append(result).append("\n");
            else{
                sb.append("#").append(i+1).append(" ").append(result+1).append("\n");
            }
        }
        System.out.print(sb);
    }
}