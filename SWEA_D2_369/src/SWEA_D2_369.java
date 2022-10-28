import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SWEA_D2_369 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int TC = Integer.parseInt(br.readLine());

        for(int i = 1 ; i <=  TC ; i++) {
            String str = String.valueOf(i); //숫자를 문자로 형변환
            int cnt = 0;
            for(int j = 0 ; j < str.length() ; j++){//문자 하나씩 검사
                char c = str.charAt(j);
                if(c == '3' || c == '6' || c == '9') cnt++;
            }
            if(cnt !=0){//cnt 개수만큼 -찍음
                for(int k = 0 ; k < cnt ; k++){
                    sb.append("-");
                }
                sb.append(" ");
            }else{
                sb.append(i).append(" ");
            }
            // 일반숫자의 경우
        }
        System.out.println(sb.delete(sb.length()-1, sb.length()));
    }
}
