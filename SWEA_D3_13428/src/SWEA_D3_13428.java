
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class SWEA_D3_13428{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int TC = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < TC ; i++){
            int M = Integer.parseInt(br.readLine());
            String M_str = String.valueOf(M);

            int result_max = M;
            int result_min = M;


            if( M == 0){ // 0이면 최댓값 최솟값이  0
                sb.append("#" + (i+1) + " ").append(0 + " " + 0).append("\n");
                continue;
            }else{
                // i와 j의 위치를 바꿔가며 최댓값 최솟값 발견
                for(int k = 0 ; k <M_str.length() ; ++k){
                    for(int j = 0 ; j < M_str.length() ; ++j){
                        char[] M_arr = M_str.toCharArray();
                        char temp = M_arr[k];
                        M_arr[k] = M_arr[j];
                        M_arr[j] = temp;
                        if( M_arr[0] != '0'){
                            int prevValue =  Integer.parseInt(String.valueOf(M_arr)); //
                            result_max =  Math.max(result_max, prevValue);
                            result_min =  Math.min(result_min, prevValue);
                        }
                    }
                }
            }

            sb.append("#" + (i+1) + " ").append(result_min + " " + result_max).append("\n");
        }
        System.out.print(sb);
    }
}