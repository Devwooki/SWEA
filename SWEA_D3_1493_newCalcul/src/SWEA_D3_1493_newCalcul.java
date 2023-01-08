import java.io.*;
import java.util.*;

public class SWEA_D3_1493_newCalcul{
    public static int p, q;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int TC = Integer.parseInt(br.readLine());
        for(int test = 1 ; test <= TC ; test++){
            st = new StringTokenizer(br.readLine());
            p = Integer.parseInt(st.nextToken());
            q = Integer.parseInt(st.nextToken());

            int N = 0, M = 0; //p와q가 몇 번째 대각선에 위치했는지 파악
            boolean check1 = false;
            boolean check2 = false;
            for(int i = 0 ; i < 150 ;++i){
                if(check1 && check2) break;
                if(p > i*(i-1)/2 && p <=i*(i+1)/2){
                    N = i;
                    check1 =  true;
                }
                if(q > i*(i-1)/2 && q <=i*(i+1)/2){
                    M = i;
                    check2 =  true;
                }
            }
            int N_cnt_P = p-N*(N-1)/2;
            int M_cnt_Q = q-M*(M-1)/2;
            int[] p_point = {N-N_cnt_P+1, N_cnt_P};
            int[] q_point = {M-M_cnt_Q+1, M_cnt_Q};

            int[] starCalcul = {p_point[0]+q_point[0], p_point[1]+q_point[1]};
            int result_N = starCalcul[0]+starCalcul[1]-1;
            int result = result_N*(result_N-1)/2 + starCalcul[1];



            sb.append("#" + test + " ").append(result).append("\n");
        }
        System.out.print(sb);
    }
}
//        for(int test = 1 ; test <= TC ; test++){
//                st = new StringTokenizer(br.readLine());
//                p = Integer.parseInt(st.nextToken());
//                q = Integer.parseInt(st.nextToken());
//
//                int N = 0, M = 0; //p와q가 몇 번째 대각선
//                for(int i = 0 ; i < 150 ;++i){
//        if(p > i*(i-1)/2 && p <=i*(i+1)/2) N = i;
//        if(q > i*(i-1)/2 && q <=i*(i+1)/2) M = i;
//        }
//        int diffP = p-N*(N-1)/2;    //N+1라인의 몇 번째에 p가 위치했는지
//        int diffQ = q-M*(M-1)/2;      //M+1라인의 몇 번째에 q가  위치했는지
//
//        int[] p_point = {(N-diffP+1), diffP};
//        int[] q_point = {(M-diffQ+1), diffQ};
//
//        int[] calculStar = {p_point[0]+q_point[0], p_point[1]+q_point[1]};
//
//        int result_N = calculStar[0]+calculStar[1]-1;
//        int result = result_N * (result_N-1)/2+calculStar[0];
//
//        sb.append("#" + test + " ").append(result).append("\n");
//        }
//        System.out.print(sb);
//        }