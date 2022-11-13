import java.io.*;

//숫자를 재배열했을 때 배수가 되면 possible, 안되면  impossible
public class SWEA_D3_14361_sameMultiple{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int TC = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < TC ; i++){
            String NStr = br.readLine();
            int N = Integer.parseInt(NStr);
            int k = 2;
            //1자리수는 재배치를 통해 배수 만들 수 없음
            if(N < 10) {
                sb.append("#").append(i + 1).append(" ").append("impossible").append("\n");
                continue;
            }else{
                /*
                N * k가  NStr의 모든 원소를 포함하고, 길이가 같으면 있으면 possible
                N * k의 길이가 NStr길이보다 길거나, 포함하지 않으면 impossible
                 */
                while (true) {
                    int cnt = 0;
                    int temp = k * N;
                    String tempStr = Integer.toString(temp);
                    k++;
                    //자연수 N과 배수 temp의 길이가 다르면 검사 재배열 불가 ->  종료
                    if(tempStr.length() != NStr.length()) {
                        sb.append("#").append(i + 1).append(" ").append("impossible").append("\n");
                        break;
                    }
                    //자연수N과 배수 temp의 원소를 비교, 모두 포함되어 있으면 cnt 1씩 증가
                    for(int j = 0 ; j < NStr.length() ; j++){
                        char c = tempStr.charAt(j);
                        if(NStr.contains(Character.toString(c))) cnt++;
                    }
                    //자연수 N과  배수 temp의 길이가 같고, cnt또한 같을 때  possible
                    if( cnt == NStr.length()) {
                        sb.append("#").append(i+1).append(" ").append("possible").append("\n");
                        break;
                    }
                }
            }
        }
        System.out.print(sb);
    }
}