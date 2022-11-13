import java.io.*;
import java.util.*;

public class SWEA_D2_1946_simpleZIP{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int TC = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < TC ; i++){
            int number = Integer.parseInt(br.readLine());
            sb.append("#").append(i+1).append("\n");
            int cnt = 0;
            for(int j = 0 ; j < number ; ++j){
                st = new StringTokenizer(br.readLine()," ");
                String str = st.nextToken();
                int len = Integer.parseInt(st.nextToken());
                while(len != 0){
                    if(cnt==10){
                        sb.append("\n");
                        cnt = 0;
                    }
                    len--;
                    sb.append(str);
                    cnt++;
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}

