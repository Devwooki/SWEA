import java.io.*;
import java.util.*;

public class SWEA_D3_3131_billionPrime{
    public static boolean prime[];
    public static int million = 100;
    public static void main(String[] args) throws IOException{
        StringBuilder sb = new StringBuilder();

        prime= new boolean[million];
        filter();
        for(int i = 2 ; i < million ; ++i )
            if(!prime[i]) sb.append(i + " ");
        System.out.print(sb);
    }

    public static void filter(){
        prime[0] = prime[1] = true;

        for(int i = 2 ; i <= Math.sqrt(million)  ; ++i){
            if(!prime[i]){
                for(int j = i*i ; j < million ; j+=i){
                    prime[j] = true;
                }
            }
        }
    }

}