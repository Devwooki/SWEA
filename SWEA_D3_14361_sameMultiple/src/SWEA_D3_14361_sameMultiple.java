import java.io.*;

//숫자를 재배열했을 때 배수가 되면 possible, 안되면  impossible
public class SWEA_D3_14361_sameMultiple{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int TC = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < TC ; i++){
            int num = Integer.parseInt(br.readLine());
            //1자리수는 배치 불가
            if(num < 10) {
                sb.append("#").append(i + 1).append(" ").append("impossible").append("\n");
                continue;
            }else{

            }


            sb.append("#").append(i+1).append(" ").append("possible").append("\n");
            sb.append("#").append(i+1).append(" ").append("impossible").append("\n");
        }
        System.out.print(sb);
    }
}