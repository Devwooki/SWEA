import java.io.*;
import java.util.*;

public class SWEA_D3_15758_infinityString{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int TC = Integer.parseInt(br.readLine());
        for(int test = 1 ; test <= TC ; test++){
            st = new StringTokenizer(br.readLine(), " ");
            String str1 = st.nextToken();
            String str2 = st.nextToken();

            int str1_len = str1.length();
            int str2_len = str2.length();

            String temp1 = "";
            String temp2 = "";
            for(int i = 0 ; i < str2_len ; ++i){
                temp1 += str1;
            }

            for(int i = 0 ; i < str1_len ; ++i){
                temp2 += str2;
            }

            if(temp1.equals(temp2)) sb.append("#" + test + " ").append("yes").append("\n");
            else sb.append("#" + test + " ").append("no").append("\n");


        }
        System.out.print(sb);
    }
}