
import java.io.*;
import java.util.*;

public class SWEA_D3_1225_PWcreator{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Queue<Integer> que = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int TC = 10;
        for(int i = 1 ; i <=TC ; i++){
            br.readLine();
            //큐에 데이터 삽입
            st = new StringTokenizer(br.readLine()," ");
            while(st.hasMoreTokens()){
                int a = Integer.parseInt(st.nextToken());
                que.add(a);
            }

            //삽입된 데이터 암호화 실시
            while(true){
                int a = 0;
                for(int j = 1 ; j < 6 ; ++j){ //사이클
                    int temp = que.poll() - j;
                    a=temp;
                    if(temp <= 0) {  //0보다 작아지거나 0일경우 0으로 저장되며 암호화 종료
                        que.add(0);
                        break;
                    }
                    else que.add(temp);
                }
                if(a <= 0){
                    break;
                }
            }

            sb.append("#").append(i).append(" ");
            while(!que.isEmpty()){
                sb.append(que.poll()).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
