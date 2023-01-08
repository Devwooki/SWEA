import java.io.*;
import java.util.*;

public class SWEA_D3_1216_pelindrom2{
    public static int len = 100;
    public static String[] str;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for(int i = 1 ; i <= 10 ; i++){
            br.readLine();
            str = new String[len];
            //배열 초기화
            for(int j = 0 ; j< 100 ; ++j){
                str[j] = br.readLine();
            }

            //길이가 2인것 부터 100까지 회문일 수 있음
            //가장 긴 것을 출력하라 했으므로 len 에서 감소해서 2까지
            for(int j = len ; j >=2 ; --j){
                if(solve(j)){
                    sb.append("#" + i +" " + j +"\n");
                    break;
                }
            }
        }
        System.out.print(sb);
    }
    //가장 긴 길이부터 시작과 끝 비교
    public static boolean solve(int str_len){
        for(int i = 0 ; i < len ; ++i){//열 100개
            for(int j = 0 ; j < len-str_len+1 ; ++j){//행 검사하는데 str_len 만큼 탐색 반복함
                if(checkRow(i,j,str_len)||checkCol(j,i,str_len)) return true;
            }
        }
        return false;
    }
    public static boolean checkRow(int i, int j, int str_len){
        for(int k = 0 ; k < str_len/2 ; ++k){ // 0 <-> 99/ 1<->98 이렇게 2지점에서 접근하며 글자가 다르면 false 다시탐색
            if(str[i].charAt(j+k) != str[i].charAt(j+str_len-1-k)) return false;
        }
        return true;
    }
    public static boolean checkCol(int i, int j, int str_len){
        for(int k = 0 ; k < str_len/2 ; ++k){
            if(str[i+k].charAt(j) != str[i+str_len-1-k].charAt(j)) return false;
        }
        return true;
    }
}