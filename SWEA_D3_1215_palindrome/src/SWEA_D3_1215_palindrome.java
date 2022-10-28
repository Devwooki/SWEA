import java.io.*;
import java.util.*;

//자바 20초 이내
public class SWEA_D3_1215_palindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new  StringBuilder();

        String[] arr = new String[8];
        String[] arrTurn90 = new String[8];

        for(int i = 0 ; i < 10; i++){
            int len = Integer.parseInt(br.readLine()); //회문 길이
            int cnt = 0;

            //배열 초기화
            for(int j = 0 ; j < arr.length ; j++){
                arr[j] = br.readLine()+ " ";
            }
            //배열 90도 돌려 새로로 탐색에 사용
            Arrays.fill(arrTurn90, "");
            for(int j = 0 ; j < 8 ; j++){
                for(int k = 8 ; k >0 ; k--){
                    arrTurn90[j] += arr[k-1].charAt(j);
                };
                arrTurn90[j] += " ";
            }


            for(int j = 0 ; j < 8 ; j++){//열
                for(int k = 0 ; k < 8 - len +1 ; k++){//행
                    StringBuilder rvs = new StringBuilder();
                    String arrSB = arr[j].substring(k, k+len);
                    rvs.append(arrSB);
                    String rvsarr = rvs.reverse().toString();

                    rvs = new StringBuilder();
                    String turnSB = arrTurn90[j].substring(k, k+len);
                    rvs.append(turnSB);
                    String rvsturn = rvs.reverse().toString();

                    //원본.equals(뒤집기)면
                    if (arrSB.equals(rvsarr))cnt++;
                    if(turnSB.equals(rvsturn))cnt++;
                }
            }



            sb.append("#").append(i+1).append(" ").append(cnt).append("\n");
            cnt = 0; //다음 tc가 실행되므로 cnt 초기화
        }
        System.out.println(sb);
    }
}
