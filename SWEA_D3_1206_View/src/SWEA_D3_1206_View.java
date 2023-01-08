import java.io.*;
import java.util.*;

public class SWEA_D3_1206_View{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for(int i = 1 ; i <= 1 ; i++){
            int N  = Integer.parseInt(br.readLine()); //건물 수
            int[] building = new int[N];
            st =new StringTokenizer(br.readLine()," ");

            //빌딩 높이들 초기화
            //좌우 두칸 이상 확보되야  조망권권
           for(int j = 0 ; j < N ;++j){
                building[j] = Integer.parseInt(st.nextToken());
            }
            int result = 0;
            for(int j = 2 ; j < N-2 ;++j){
                //기준이 되는 빌딩 좌,우 중  하나라도 기준보다 크면 조망권x
                int max = -1;
                if(building[j-2] >= building[j]
                        ||building[j-1] >= building[j]
                        ||building[j] <= building[j+1]
                        ||building[j] <= building[j+2])
                    continue;
                else{
                    max = Math.max(max, Math.max(building[j-2], Math.max(building[j-1], Math.max(building[j+1], building[j+2]))));
                    result += (building[j] - max);
                }
            }
            sb.append("#" + i + " ").append(result).append("\n");
        }
        System.out.print(sb);
    }
}