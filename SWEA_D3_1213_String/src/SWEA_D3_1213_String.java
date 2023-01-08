import java.io.*;
import java.util.*;

public class SWEA_D3_1213_String{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for(int test = 1 ; test <= 1 ; test++){
            br.readLine();
            String sub = br.readLine();
            String str = br.readLine()+" ";
            int cnt = 0;
            for(int i = 0 ; i < str.length()-sub.length() ; ++i){
                String temp = str.substring(i, i+sub.length());
                if(sub.equals(temp)) cnt++;
            }
            sb.append("#" + test + " ").append(cnt).append("\n");
        }

        System.out.print(sb);
    }
}