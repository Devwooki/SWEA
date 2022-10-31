import java.io.*;
import java.util.*;

public class SWEA_D3_15230_alphastudy{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int TC = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < TC ; i++){
            String str =  br.readLine();
            char c = 'a';
            int cnt = 0;
            for(int j = 0 ; j < str.length() ; ++j){
                if(c == str.charAt(j)){
                    cnt++;
                    c++;
                }else break;
            }
            sb.append("#").append(i+1).append(" ").append(cnt).append("\n");

        }

        System.out.println(sb);
    }
}
