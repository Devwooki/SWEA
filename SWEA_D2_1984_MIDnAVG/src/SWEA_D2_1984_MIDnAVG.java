import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SWEA_D2_1984_MIDnAVG {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int TC = Integer.parseInt(br.readLine());
        double result = 0.0;
        int[] arr = new int[10];

        for(int i = 0 ; i < TC ; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0 ; j < arr.length ; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);

            for(int k = 1 ; k < arr.length -1 ; k++){
                result += arr[k];
            }

            sb.append("#").append(i+1).append(" ").append(Math.round(result/8)).append("\n");
            result=0.0;
        }

        System.out.print(sb);
    }
}
