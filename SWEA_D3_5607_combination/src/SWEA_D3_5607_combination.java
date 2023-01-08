import java.io.*;
import java.util.*;


/*
페르마의 소정리
p는 소수, a는 정수고 a != q라고 할 때 a^p와 a는 합동이다
-> a^p = a (mod p) -> a^(p-1) = 1 (mod p)

nCr = n!/r!(n-r)!을 페르마의 소정리 적용
->  n! *  (r!(n-r)!)^-1 // (r!(n-r)!)=a로 치환해서  페르마식을 적용하면
a^(p-1) = 1 (mod p)에서  양변에 a^(-1) -> a^(p-2)= a^-1 (mod p)가 된다.
즉, (r!(n-r)!)^(p-2)  = (r!(n-r)!)^-1이 된다.
// p = 1234567891임을 기억
 */

public class SWEA_D3_5607_combination{
    public static long MOD = 1234567891;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int TC = Integer.parseInt(br.readLine());
        for(int test = 1 ; test <= TC ; test++){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());

            //팩토리얼을 저장할 배열
            long[] facto = new long[N];
            long[0]=1;
            for(int i = 1 ; i<N ; ++i) facto[i]= facto[i-1] *i;

            sb.append("#" + test + " ").append(0).append("\n");
        }
        System.out.print(sb);
    }
}