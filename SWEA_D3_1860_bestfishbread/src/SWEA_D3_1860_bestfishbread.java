import java.io.*;
import java.util.*;

public class SWEA_D3_1860_bestfishbread{
    public static int N, M, K;
    public static int arriveTime[];

    public static String isPossible(){
        int fishBread = 0;
        for(int i = 1 ; i<=N  ;++i){
            fishBread = K * (arriveTime[i-1]/M) - i; //해당 시점의 사람  수(i)만큼 빵을 사감
            // ex) 2초마다 붕어빵 3개 만들 수 있고 사람이 3초에옴 -> 붕어빵 수는 3* (3/2) -1 =>  2개남음
            // ex) 2초마다 붕어빵 3개 만들 수 있고 2번째 사람이 5초에옴 -> 붕어빵 수는 3 * (5/2) -2 =>  4개남음
            if(fishBread < 0) return "Impossible";
        }
        return "Possible";
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int TC = Integer.parseInt(br.readLine());
        for(int test = 1 ; test <= TC ; test++){
            st = new StringTokenizer(br.readLine()," ");
            N = Integer.parseInt(st.nextToken()); //자격을 얻은 사람
            M = Integer.parseInt(st.nextToken()); //K개 붕어빵 만드는 시간
            K = Integer.parseInt(st.nextToken()); //M초 동안 만드는 붕어빵 갯수

            arriveTime = new int[N];
            st = new StringTokenizer(br.readLine()," ");
            for(int i = 0 ; i < N ;++i){
                arriveTime[i] = Integer.parseInt(st.nextToken()); //자격을 얻은 사람
            }
            Arrays.sort(arriveTime);

            sb.append("#" + test + " ").append(isPossible()).append("\n");
        }
        System.out.print(sb);
    }
}


//TC 998에서 멈춤
//import java.io.*;
//import java.util.*;
//
//public class SWEA_D3_1860_bestfishbread{
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        StringTokenizer st;
//        int TC = Integer.parseInt(br.readLine());
//        for(int test = 1 ; test <= TC ; test++){
//            st = new StringTokenizer(br.readLine()," ");
//            int N = Integer.parseInt(st.nextToken()); //자격을 얻은 사람
//            int M = Integer.parseInt(st.nextToken()); //K개 붕어빵 만드는 시간
//            int K = Integer.parseInt(st.nextToken()); //M초 동안 만드는 붕어빵 갯수
//
//            int[] arriveTime = new int[N];
//            st = new StringTokenizer(br.readLine()," ");
//            for(int i = 0 ; i < N ;++i){
//                arriveTime[i] = Integer.parseInt(st.nextToken()); //자격을 얻은 사람
//            }
//            Arrays.sort(arriveTime);
//
//            //빵나오는 시간별 누적 붕어빵 량
//            int[] bread = new int[arriveTime[N-1]+1]; //도착시간이 11111이지만 효율성을 위해 도착시간이 가장 긴 사람을 기준으로
//            for(int i = 0 ; i < bread.length ; ++i){//M마다 빵이 나옴
//                if(i%M == 0 ) bread[i] = (i/M)*K;
//            }
//
//            boolean eat = true;
//            for(int i = 0 ; i < N ;++i){
//                if(arriveTime[i] < M){  //빵나오는 시간보다 손님이 먼저 도착
//                    //sb.append("#" + test + " ").append("Possible").append("\n");
//                    eat  = false;
//                    break;
//                }else if(arriveTime[i] >= M){
//                    int timeToBread = arriveTime[i] -arriveTime[i]%M;
//                    if( bread[timeToBread] == 0){
//                        //sb.append("#" + test + " ").append("Possible").append("\n");
//                        eat = false;
//                        break;
//                    }else{
//                        bread[timeToBread ] -= 1;
//                        continue;
//                    }
//
//                }
//            }
//            //기다리는 시간없이 붕어빵을 제공할 수 있으면 possible
//            // 붕어빵 M초마다 K개늘어나고 손님 오면 1개씩 ㅊ ㅏ감
//
//            if(eat)sb.append("#" + test + " ").append("Possible").append("\n");
//            else sb.append("#" + test + " ").append("Impossible").append("\n");
//        }
//        System.out.print(sb);
//    }
//}
