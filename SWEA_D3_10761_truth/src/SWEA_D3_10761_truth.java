import java.io.*;
import java.util.*;

//두로봇이 동시에 버튼 누룰 수 없음
public class SWEA_D3_10761_truth{
    //움직이는건 동시에 가능하나 버튼 누르는건 동시에 못함?
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int TC = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < TC ; i++){
            st = new StringTokenizer(br.readLine()," ");

            sb.append("#").append(i+1).append(" ").append(0).append("\n");
        }
        System.out.print(sb);
    }
}

class bot{
    int move = 0;

}