import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class SWEA_D3_1230_PW3 {
    public static ArrayList<String> PW;
    public static int N;
    public static void ADD(StringTokenizer st){
        int y =Integer.parseInt(st.nextToken());
        for(int j = 0 ; j < y ;++j){
            PW.add(st.nextToken());
        }
    }
    public static void DEL(StringTokenizer st){
        int x =Integer.parseInt(st.nextToken());
        int y =Integer.parseInt(st.nextToken());
        for(int i = 0 ; i < y ; ++i){
            PW.remove(x);
        }
    }
    public static void INS(StringTokenizer st){
        int x =Integer.parseInt(st.nextToken());
        int y =Integer.parseInt(st.nextToken());
        for(int j = 0 ; j < y ;++j){
            PW.add((x+j), st.nextToken());
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for(int test = 1 ; test <= 10 ; test++){
            sb.append("#" + test + " ");
            N = Integer.parseInt(br.readLine());

            PW = new ArrayList<>();
            st = new StringTokenizer(br.readLine()," ");
            for(int i = 0 ; i < N ;++i){
                PW.add(st.nextToken());
            }

            int cmd_len = Integer.parseInt(br.readLine());

            st = new StringTokenizer(br.readLine()," ");
            for(int i = 0 ; i < cmd_len ; ++i){
                String CMD = st.nextToken();
                switch(CMD){
                    case "I" :
                        INS(st);
                        break;
                    case "D" :
                        DEL(st);
                        break;
                    case "A" :
                        ADD(st);
                        break;
                }
            }

            for(int i= 0 ; i < 10 ; ++i){
                sb.append(PW.get(i)+" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}