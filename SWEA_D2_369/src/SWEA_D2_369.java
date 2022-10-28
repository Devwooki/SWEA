import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SWEA_D2_369 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());
        String str = "";

        for(int i = 1 ; i <=  TC ; i++) {
            str += String.valueOf(i) + " ";
        }

        if(str.contains("3") || str.contains("6")||str.contains("9")){
            str = str.replaceAll("[369]", "-");
        }
        str = str.substring(0, str.length()-1);
        System.out.println(str);
    }
}
