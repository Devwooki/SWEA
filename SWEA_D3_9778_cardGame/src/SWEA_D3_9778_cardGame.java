import java.io.*;
import java.util.*;

public class SWEA_D3_9778_cardGame{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int TC = Integer.parseInt(br.readLine());
        for(int test = 1 ; test <= TC ; test++){

            int[] deck = {0,0,4,4,4,4,4,4,4,4,16,4};

            int N = Integer.parseInt(br.readLine());
            int sum = 0;
            for(int i = 0 ; i < N ; ++i){
                int x = Integer.parseInt(br.readLine());
                sum += x;
                deck[x]--;
            }

            int diff = 21 - sum; //diff보다 큰 값을 뽑으면 지게됨
            int biggerThen21 = 0; //21보다 크게 만드는 카드의 개수
            for(int i = diff+1 ; i < deck.length ; ++i){
                biggerThen21 += deck[i];
            }

            int smallerThen21 = 52 - N - biggerThen21; //21 이하로 만드는 카드의 개수

            if(smallerThen21 > biggerThen21) sb.append("#" + test + " ").append("GAZUA").append("\n");
            else sb.append("#" + test + " ").append("STOP").append("\n");


        }
        System.out.print(sb);
    }
}
