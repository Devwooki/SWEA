import java.io.*;
import java.util.*;

public class SWEA_D3_10580_powerPole{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int TC = Integer.parseInt(br.readLine());
        //3개 이상의 점선이 하나의 점에서 만나지 않는다. -> 점선 2개씩 비교 -> 완전탐색

        for(int i = 1 ; i <= TC ; i++){
            int N = Integer.parseInt(br.readLine());
            int cnt = 0;
            String[] point = new String[N];
            for(int j = 0 ; j < N ; ++j){
                point[j] = br.readLine();
            }
            for(int j = 0 ; j < N ; ++j){
                String[] s1 = point[j].split(" ");
                int A1 =  Integer.parseInt(s1[0]);
                int B1 =  Integer.parseInt(s1[1]);

                for(int k = j + 1 ; k < N ; ++k){
                    String[] s2 = point[k].split(" ");
                    int A2 =  Integer.parseInt(s2[0]);
                    int B2 =  Integer.parseInt(s2[1]);
                    if(cross(A1,B1, A2, B2)) cnt++;
                }
            }
            sb.append("#" + i + " ").append(cnt).append("\n");
        }
        System.out.print(sb);
    }

    //
    public static boolean cross(int a1,int b1, int a2, int b2){
        if( a1 > a2 && b1 < b2) return true;
        else if( a1 < a2 && b1 > b2) return true;
        else return false;
    }
}