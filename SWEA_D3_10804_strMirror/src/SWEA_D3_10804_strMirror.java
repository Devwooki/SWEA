
import java.io.*;
import java.util.*;

public class SWEA_D3_10804_strMirror{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int TC = Integer.parseInt(br.readLine());
        for(int i = 1 ; i <= TC ; i++){
            sb.append("#" + i + " ");
            String str = br.readLine();
            for(int j = str.length()-1 ; j >= 0 ; --j){
                char c = str.charAt(j);
                switch(c){
                    case 'b' : sb.append('d'); break;
                    case 'd' : sb.append('b'); break;
                    case 'p' : sb.append('q'); break;
                    case 'q' : sb.append('p'); break;
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}