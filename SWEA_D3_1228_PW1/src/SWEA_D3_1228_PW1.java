import java.io.*;
import java.util.*;

public class SWEA_D3_1228_PW1{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for(int test = 1 ; test <= 10 ; test++){
            sb.append("#" + test + " ");
            int N = Integer.parseInt(br.readLine());

            ArrayList<String> PW = new ArrayList<>();
            st = new StringTokenizer(br.readLine()," ");
            for(int i = 0 ; i < N ;++i){
                PW.add(st.nextToken());
            }

            int CMD = Integer.parseInt(br.readLine());

            st = new StringTokenizer(br.readLine()," ");
            for(int i = 0 ; i < CMD ; ++i){
                String ins = st.nextToken();
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                for(int j = 0 ; j < y ;++j){
                    PW.add((x+j), st.nextToken());
                }
            }

            for(int i= 0 ; i < 10 ; ++i){
                sb.append(PW.get(i)+" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}