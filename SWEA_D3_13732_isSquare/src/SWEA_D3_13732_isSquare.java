import java.io.*;

public class SWEA_D3_13732_isSquare{
    /*
    좌 상단에서 # 처음 발견! 가로방향 갯수 구함(width_cnt)
    #을 시작으로 각 열마다 세로 #갯수(height_cnt)구함
    -> width_cnt == height_cnt 같으면 -> 가로 줄 1개, 세로 줄 1개 길이 같음 -> check_wh +1;
    check_wh와 width_cnt 같으면 정사각형 모두 채워진 것 -> yes출력

     */
    public static String[] arr;
    public static int startX;
    public static int startY;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int TC = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < TC ; ++i){

            int N = Integer.parseInt(br.readLine());
            arr = new String[N];
            //배열 초기화
            for(int j = 0 ; j  < N ; ++j){
                arr[j] = br.readLine();
            }

            boolean isFirst = true; //처음 #을 발견하면 false로 변경
            int blockCnt = 0;
            int checkedSize = 0;
            //좌 상단 첫 # 발견
            for(int j = 0 ; j  < N ; ++j){
                for(int k = 0; k < N ; ++k){
                    char c = arr[j].charAt(k);
                    if(c == '#'){ //탐색 중 첫 #발견하면 좌표 저장
                        blockCnt++;
                        if (isFirst) {
                            isFirst = false;
                            startX = k;
                            startY = j;
                        }
                    }
                }
            }

            //정사각형인지 확인
            int width_cnt = getWidthCNT(startX, startY); //가로 #갯수 구함
            for(int j = startX ; j < N ; ++j){ // 가로 # 갯수 == 세로# 갯수,
                int height_cnt = getHeightCNT(j, startY);
                if(height_cnt == width_cnt) checkedSize+=height_cnt;
            }


            if(checkedSize == blockCnt)
                sb.append("#").append(i+1).append(" yes").append("\n");
            else
                sb.append("#").append(i+1).append(" no").append("\n");
        }
        System.out.print(sb);
    }

    //#을 기준으로 '연속된' #의 갯수 구함(가로)
    public static int getWidthCNT(int x, int y){
        int cnt = 0;
        for(int i =  x  ;  i < arr.length ; ++i){
            if(arr[y].charAt(i) == '#')
                cnt++;
            else break;
        }
        return cnt;
    }
    //#을 기준으로 '연속된' #의 갯수 구함(세로)
   public static int getHeightCNT(int x, int y){
        int cnt = 0;
        for(int i = y ;  i < arr.length ; ++i){
            if(arr[i].charAt(x) == '#')
                cnt++;
            else break;
        }
        return cnt;
    }
}

/*
4
.##.
####
....
.... 같은경우 yes로 나옴
문제 1 : 첫 #을 기준으로 상하 좌우 탐색함
 -> #의 x좌표보다 작은 위치에 #이 있으 경우 정사각형이 아닌데정사각형으로 인식함


해결법 : 전체 #갯수와 세로탐색하며 발견한 #의 누적합과 같은지지
        for(int i = 0  i < TC ; ++i){

            int N = Integer.parseInt(br.readLine());
            arr = new String[N];
            //배열 초기화
            for(int j = 0 ; j  < N ; ++j){
                arr[j] = br.readLine();
            }

            boolean isFirst = true; //처음 #을 발견하면 false로 변경
            int check_wh = 0;
            int blockCnt = 0;
            int  checkedSize = 0;
            //좌 상단 첫 # 발견
            for(int j = 0 ; j  < N ; ++j){
                for(int k = 0; k < N ; ++k){
                    char c = arr[j].charAt(k);
                    if(c == '#' && isFirst) {
                            isFirst = false;
                            startX = k;
                            startY = j;
                        }
                    }
                }
            }

            //정사각형인지 확인
            int width_cnt = getWidthCNT(startX, startY); //가로 #갯수 구함
            for(int j = startX ; j < N ; ++j){ // 가로 # 갯수 == 세로# 갯수,
                int height_cnt = getHeightCNT(j, startY);
                if(height_cnt == width_cnt) check_wh;
            }


            if(width_cnt == check_wh)
                sb.append("#").append(i+1).append(" yes").append("\n");
            else
                sb.append("#").append(i+1).append(" no").append("\n");
        }
 */