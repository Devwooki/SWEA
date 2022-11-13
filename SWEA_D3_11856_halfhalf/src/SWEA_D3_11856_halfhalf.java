
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class SWEA_D3_11856_halfhalf{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int TC = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < TC ; i++){
            String str = br.readLine();
            char[]  alpha = new char[26];
            boolean isDiff = false;
            int two_alpha=0;
            for(int j = 0 ; j < str.length() ;  ++j){
                alpha[str.charAt(j)-65]++;
            }

            for(int j = 0 ; j < alpha.length ;  ++j){
                if(alpha[j] ==  2 )
                    two_alpha++;
            }

            if(two_alpha == 2) sb.append("#" + (i+1) + " ").append("Yes").append("\n");
            else sb.append("#" + (i+1) + " ").append("No").append("\n");

        }
        System.out.print(sb);
    }
}