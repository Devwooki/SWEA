import java.io.*;
import java.util.StringTokenizer;

public class SWEA_D3_3431_workmanage {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int TC = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < TC ; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int L = Integer.parseInt(st.nextToken());
            int U = Integer.parseInt(st.nextToken());
            int X = Integer.parseInt(st.nextToken());

            if( L < X && X < U) sb.append("#").append(i+1).append(" ").append(0).append("\n");
            else if (X > U) sb.append("#").append(i+1).append(" ").append(-1).append("\n");
            else if ( X < L) sb.append("#").append(i+1).append(" ").append(L-X).append("\n");
        }

        System.out.println(sb);
    }
}