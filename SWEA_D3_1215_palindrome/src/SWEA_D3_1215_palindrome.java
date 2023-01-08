import java.io.*;
import java.util.*;

//자바 20초 이내
public class SWEA_D3_1215_palindrome {
    public static String[] arr;
    public static int len;
    public static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new  StringBuilder();

        arr = new String[8];

        for(int test = 1 ; test <= 1; test++){
            len = Integer.parseInt(br.readLine()); //회문 길이

            //배열 초기화
            for(int j = 0 ; j < arr.length ; j++){
                arr[j] = br.readLine()+ " ";
            }

            for(int i = 0 ; i < 8 ; ++i){
                for(int j = 0 ; j < 8-len +1  ; ++j){
                    if(CheckRow(i,j,len) || CheckCol(j, i , len))  cnt++;
                }
            }
            sb.append("#").append(test).append(" ").append(cnt).append("\n");
            cnt = 0; //다음 tc가 실행되므로 cnt 초기화
        }
        System.out.println(sb);
    }

    public static boolean CheckRow(int i, int j, int str_len){
        for(int a = 0 ; a < str_len/2 ; ++a){
            if(arr[i].charAt(j+a) != arr[i].charAt(j+str_len-1-a))  return  false;
        }
        return true;
    }
    public static boolean CheckCol(int i, int j, int str_len){
        for(int a = 0 ; a < str_len/2 ; ++a){
            if(arr[i+a].charAt(j) != arr[i+str_len-1-a].charAt(j))  return  false;
        }
        return true;
    }
}
