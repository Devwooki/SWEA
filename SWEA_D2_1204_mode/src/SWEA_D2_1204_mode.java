import java.util.*;
import java.io.*;

public class SWEA_D2_1204_mode {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new  StringBuilder();
        StringTokenizer  st;
        int TC = Integer.parseInt(br.readLine());

        int[] cnt = new int[101]; //점수 0점부터 100점까지 101개
        int[] score = new int[1001]; // 점수 분포가 모두 숫자1개일 수 있으므로
        int mode = Integer.MIN_VALUE;

        for(int i = 0 ; i < TC ; i++){
            br.readLine();
            st = new StringTokenizer(br.readLine(), " ");
            Arrays.fill(cnt, 0); // 새로운 TC마다 배열값 0으로 초기화
            Arrays.fill(score, 0);

            while(st.hasMoreTokens()){	//num마다 갯수 1씩 증가
                int num =  Integer.parseInt(st.nextToken());
                cnt[num]++;
            }

            for(int j = 0 ; j<cnt.length; j++){ //cnt[점수] = 점수 출현 빈도, 최빈값 찾기
                if(mode < cnt[j]) mode = cnt[j];
            }

            for(int k = 0 ; k<cnt.length ; k++){//cnt[점수] 끝까지 탐색하면서 최빈값인 것 score배열에 작은 것 부터 삽입
                if(mode == cnt[k]){
                    score[mode] = k;
                    //System.out.print( k+ " ");
                }
            }
            sb.append("#").append(i+1).append(" ").append(score[mode]).append("\n");
            mode = Integer.MIN_VALUE;
        }


        System.out.println(sb);
    }
}