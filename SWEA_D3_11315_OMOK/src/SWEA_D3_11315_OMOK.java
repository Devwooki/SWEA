import java.io.*;
import java.util.*;

public class SWEA_D3_11315_OMOK{
    //20 * 20 -> 400/ 100개 tc  400000
    //5개 이상
    public static int N;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int TC = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < TC ; i++){
            N = Integer.parseInt(br.readLine());
            String[] arr =new String[N];
            boolean isOMOK =  false;
            //체스판 초기화
            for(int j = 0 ; j< N;  ++j){
                arr[j] = br.readLine();
            }

            //검사
            int a;
            int b;
            int d;
            int e;
            for(int j= 0 ; j < N  ; ++j) {
                if(isOMOK) break;
                for(int k= 0 ; k < N  ; ++k) {
                    char c = arr[j].charAt(k);
                    if(c == 'o'){
                        a = checkWidth(arr,j,k);
                        b = checkHeight(arr,j,k);
                        d = checkR(arr,j,k);
                        e = checkL(arr,j,k);

                        if(a >= 5 || b >=5 || d >= 5 || e >=5){
                            isOMOK = true;
                            break;
                        }
                    }
                }
            }
            if(isOMOK) sb.append("#").append(i+1).append(" YES").append("\n");
            else  sb.append("#").append(i+1).append(" NO").append("\n");
        }
        System.out.print(sb);
    }

    //가로갯수 cnt
    public static int checkWidth (String[] s, int i, int j){
        int cnt = 0;
        for(int k = j ; k < N ; ++k){
            if(s[i].charAt(k) == 'o') {
                cnt++;
            }else{
                break;
            }
        }
        return cnt;
    }
    //세로 갯수 cnt
    public static int checkHeight (String[] s, int i, int j){
        int cnt = 0;
        for(int k = i ; k < N ; ++k){
            if(s[k].charAt(j) == 'o') {
                cnt++;
            }else{
                break;
            }
        }
        return cnt;
    }
    //오른쪽 대각선 검사
    public static int checkR (String[] s, int i, int j){
        int cnt = 0;
        while(true) {
            if(i > N-1 || j > N-1){
                break;
            }
            if(s[i].charAt(j) == 'o') cnt++;
            else break;
            i++;
            j++;
        }
        return cnt;
    }
    //왼쪽 대각선  검사
    public static int checkL (String[] s, int i, int j){
        int cnt = 0;
        while(true) {
            if(i > N-1 || j < 0){
                break;
            }
            if(s[i].charAt(j) == 'o') cnt++;
            else break;
            i++;
            j--;
        }
        return cnt;
    }
}