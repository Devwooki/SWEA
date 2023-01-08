import java.io.*;
import java.util.*;

public class SWEA_D3_10059_deadLine{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int TC = Integer.parseInt(br.readLine());
        for(int test = 1 ; test <= TC ; test++){
            String str = br.readLine();
            String front = str.substring(0,2);
            String back = str.substring(2,4);

            int int_front = Integer.parseInt(String.valueOf(front));
            int int_back = Integer.parseInt(String.valueOf(back));

            boolean bool_front = false;
            boolean bool_back = false;

            if( 1 <= int_front && int_front <=12 ) bool_front = true;
            if( 1 <= int_back && int_back <=12 ) bool_back = true;

            if(bool_front && !bool_back) sb.append("#" + test + " ").append("MMYY").append("\n");
            else if(!bool_front && bool_back) sb.append("#" + test + " ").append("YYMM").append("\n");
            else if(bool_front && bool_back) sb.append("#" + test + " ").append("AMBIGUOUS").append("\n");
            else sb.append("#" + test + " ").append("NA").append("\n");

        }
        System.out.print(sb);
    }
}