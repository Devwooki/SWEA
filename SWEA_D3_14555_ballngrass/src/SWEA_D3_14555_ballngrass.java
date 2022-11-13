import java.io.*;
import java.util.*;

public class SWEA_D3_14555_ballngrass{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int TC = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < TC ; i++){
            int result = 0;
            String str = br.readLine();
            str += " "; //꼼수
            for(int j = 0 ; j < str.length()-1 ; ++j){
                char c = str.charAt(j);
                switch(c){
                    // (다음에 |이거나  |다음에)면
                    case '(' :
                        stack.push('(');
                        break;
                    case ')' :
                        stack.pop();
                        result++;
                        break;
                    case '|' :
                        if(!stack.isEmpty() && stack.peek() == '(') {
                            result++;
                            stack.pop();
                        } else if( str.charAt(j+1) == ')'){
                            stack.push('|');
                        }break;

                }
            }
            sb.append("#").append(i+1).append(" ").append(result).append("\n");
        }
        System.out.print(sb);
    }
}