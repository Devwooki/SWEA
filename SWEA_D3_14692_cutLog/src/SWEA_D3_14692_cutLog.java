import java.io.*;
import java.util.*;

public class SWEA_D3_14692_cutLog{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int TC = Integer.parseInt(br.readLine());

        //Alice, Bob순서로 자르며 이긴 사람출력하게
        for(int i = 0 ; i < TC ; i++){
            int N =  Integer.parseInt(br.readLine());

            if(N%2 == 0)
                sb.append("#").append(i+1).append(" ").append("Alice").append("\n");
            else
                sb.append("#").append(i+1).append(" ").append("Bob").append("\n");
        }
        System.out.print(sb);
    }
}