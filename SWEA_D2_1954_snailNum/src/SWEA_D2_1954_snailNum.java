import java.io.*;

public class SWEA_D2_1954_snailNum {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int TC = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < TC ; i++){
            int N = Integer.parseInt(br.readLine());
            //벽이 꺾이는 순서 우 하 좌 상 순서
            // 방향에 이미 숫자가 있거나 벽(index가 0또는 N)이면 방향 전환
            int[][] arr = new int[N][N];
            int[] dx = {1,0, -1, 0}; // x 우 하 좌 상 움직일 때
            int[] dy = {0,1,0,-1};  //  y:우 하 좌 상 움직일 때
            //배열0,0이 좌상단에 위치
            int num = 1, x = 0, y = 0, dir=0;
            while(num <= N*N){
                arr[y][x] = num;
                x +=dx[dir];    //다음 x좌표
                y +=dy[dir];    //다음 y좌표

                // 좌표 변경 했을 때 벽을 만나거나 숫자가 이미 들어있을 때 방향전환
                if(x < 0 || x > N-1 || y < 0 || y > N-1 || arr[y][x] != 0){
                    //이전 좌표로 이동
                    x -= dx[dir];
                    y -= dy[dir];
                    dir = (dir+1)%4;//방향 전환
                    // 새로운 좌표 설정
                    x += dx[dir];
                    y += dy[dir];
                }
                num++;
            }
            sb.append("#"+(i+1)+"\n");
            for(int row = 0 ; row < N ; ++row){
                for(int col = 0 ; col < N ; ++col){
                    sb.append(arr[row][col] + " ");
                }
                sb.append("\n");
            }
        }
        System.out.print(sb);
    }
}
