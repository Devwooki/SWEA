import java.io.*;
import java.util.*;

// a1 ~ a7까지 존재
// a1 : 일요일 ~  a7 : 토요일
// a1 ~ a7은은 0과 1의 값을 가지며  수업이 열리면 1, 아니면 0, 적어도 하루는 열림
// n일 동안 수업들을 때 최소 일 수
public class SWEA_D3_13038_chageStudent{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int TC = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < TC ; i++){

            int date = Integer.parseInt(br.readLine());
            int isFirstIDX = -1;
            st = new StringTokenizer(br.readLine(), " ");


            int[] isLesson = new int[7]; //수업 날짜 저장
            int[] s_days= new int[7];   // 수업 하는 날짜 저장하는 배열
            int startWith = 0;  //s_days의  idx
            for(int j = 0 ; j < 7 ; ++j){
                isLesson[j] = Integer.parseInt(st.nextToken());
                if(isLesson[j] == 1){
                    s_days[startWith] = j;
                    startWith++;
                }
            }

            int min = Integer.MAX_VALUE;
            for(int j = 0 ; j < startWith ; ++j){
                int temp = date;
                int cntDay = 0;
                while(temp !=  0){
                    int k = (cntDay+s_days[j])%7;
                    if(isLesson[(k)] == 1){
                        temp--;
                    }
                    cntDay++;
                }
                min = Math.min(min, cntDay);
            }

            sb.append("#" + (i+1) + " ").append(min).append("\n");
        }
        System.out.print(sb);
    }
}