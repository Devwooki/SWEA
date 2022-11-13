//import java.io.*;
//import java.util.*;
//
//public class SWEA_D3_10726_binary{
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        StringTokenizer st;
//        int TC = Integer.parseInt(br.readLine());
//        for(int i = 0 ; i < TC ; i++){
//            st = new StringTokenizer(br.readLine()," ");
//            int N = Integer.parseInt(st.nextToken());
//            int M = Integer.parseInt(st.nextToken());
//            String l = String.valueOf(M);
//            String MtoBin = Integer.toBinaryString(M);
//
//            if(N > MtoBin.length()){
//                sb.append("#").append(i+1).append(" OFF").append("\n");
//                continue;
//            }
//
//            int cnt = 0;
//            for(int j = MtoBin.length() - N ; j < MtoBin.length() ; ++j){
//                if(MtoBin.charAt(j) == '1') cnt++;
//            }
//
//            if(cnt == N) sb.append("#").append(i+1).append(" ON").append("\n");
//            else sb.append("#").append(i+1).append(" OFF").append("\n");
//
//        }
//        System.out.print(sb);
//    }
//}
import java.io.*;
import java.util.*;

public class SWEA_D3_10726_binary{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int TC = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < TC ; i++){
            st = new StringTokenizer(br.readLine()," ");

            //시작과 끝을 제곱근으로 지정해 연산 결과를 더 줄임
            int start = (int) Math.ceil(Math.sqrt(Integer.parseInt(st.nextToken())));
            int end = (int) Math.sqrt(Integer.parseInt(st.nextToken()));
            int cnt = 0;

            for(int j = start ; j <= end ; ++j){
                if(isPaelin(j))
                    if(isPaelin(j*j)) cnt++;
            }
            sb.append("#").append(i+1).append(" ").append(cnt).append("\n");
        }
        System.out.print(sb);
    }

    public static boolean isPaelin(int n){
        if( n < 10) return true;

        String N = String.valueOf(n);
        int mid = N.length()/2;
        String front = N.substring(0, mid);
        String back = N.substring(N.length()% 2 == 0 ? mid:mid+1, N.length());
        //글자 수 홀수면 정 가운데는 필요없음
        if(front.equals(back)) return true;
        else return false;
    }

}