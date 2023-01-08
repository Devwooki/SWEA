import java.io.*;
import java.util.*;

public class SWEA_D3_2817_sumOfpartnumarr{
    public static int[] arr;
    public static int N;
    public static int K;
    public static int cnt;
    //합이 K가 되는 경우의 수 idx : k를 만들기 위한 숫자개수
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int TC = Integer.parseInt(br.readLine());
        for(int i = 1 ; i <= TC ; i++){
            st = new StringTokenizer(br.readLine()," ");
            cnt = 0;
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            //수열 초기화
            arr = new int[N];
            st = new StringTokenizer(br.readLine()," ");
            for(int j = 0 ; j < N ;++j){
                arr[j] = Integer.parseInt(st.nextToken());
            }

            //1개이상 선택해서 합이 K가 되는 경우의 수수
            /*
            3 / 1 2 1 2라고하면
            1개로   3을 만들기 o
            2개로 3을만들기 12 12 21 21
            ...반복
             */

            solve(0,0);
            sb.append("#" + i + " ").append(cnt).append("\n");
        }
        System.out.print(sb);
    }

    public static void solve(int idx, int sum){
        if(K==sum){ //합이  K랑 같으면 cnt++
            cnt++;
            return;
        }
        else if(sum > K || idx >= N) return; //합이 K를 넘음거나 idx를 1씩 증가하다보니 n을 초과해도 stop


        solve(idx+1, sum+arr[idx]);//다음 배열 값을 합하는 경우(이전 인덱스 값을 더해서 K와 비교)
        solve(idx+1, sum);  //포함하지 않고 새로운 탐색을 하는경우
    }
}