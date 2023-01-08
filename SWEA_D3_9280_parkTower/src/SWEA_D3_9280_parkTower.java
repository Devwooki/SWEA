import java.io.*;
import java.util.*;
//주차장 큐, 대기차량 큐 단위무게당 요금 배열
//주차요금 : 차량 무게 * 공간마다 책정된 단위 무게,  이용시간 고려x
//
/*
M대의 차량 입장 순서를 알고 ㅇ ㅣㅆ음
총 수입 계산하기
 */
public class SWEA_D3_9280_parkTower{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int TC = Integer.parseInt(br.readLine());
        for(int test = 1 ; test <= TC ; test++){
            int result = 0;
            st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken()); //단위 무게당 요금 갯수 및 주차장 공간
            int m = Integer.parseInt(st.nextToken()); //차량 i의 무게 w가 정수로 주어짐

            HashMap<Integer, Integer> w_pay = new HashMap<>();
            HashMap<Integer, Integer> c_weight = new HashMap<>();

            //단위 무게 지정
            for(int i = 1 ; i <= n ; ++i){
                w_pay.put(i,Integer.parseInt(br.readLine()));
            }
            //차량 무게 저장
            for(int i = 1 ; i <= m ; ++i){
                c_weight.put(i,Integer.parseInt(br.readLine()));
            }

            Queue<Integer> waiting = new LinkedList<Integer>(); //대기 차량 큐
            int[] park = new int[n+1];//차가 어디에 주차 되었는지 확인
            int cnt = 0;
            for(int i = 0 ; i < 2*m ; ++i){
                int x = Integer.parseInt(br.readLine());
                if(x>0){//차량 넣음-> 차량 넣을 때 N만큼 주차되면 waiting에 삽입
                    if(cnt == n){ //주차 장이 만석이면
                        waiting.add(x); //현재 차량 대기줄에 넣기
                        continue; //다음 단계로 넘어감
                    }
                    for(int j = 1; j <= n ;++j){ //매번 빈자리에서 새로 넣음
                        if(park[j]==0){
                            park[j]=x;
                            result += w_pay.get(j) * c_weight.get(x);//j위치 가격 * 차 무게
                            cnt++; //주차장에 있는 차의 수
                            break;
                        }
                    }


                }else{//차량 빼는 것
                    x *= -1;
                    for(int j = 1 ; j <= n ;++j){
                        if(park[j] == x) {
                            park[j] = 0; //x차 빼고  0으로 만듬 -> 이후 큐에서 꺼내 제일 앞쪽에 넣기
                            cnt--; //주차장 차량 수 빠짐
                            break;
                        }
                    }

                    //차가 빠져나갔으니 큐에 원소가 있다면
                    if(cnt < n){
                        if(!waiting.isEmpty()){ //
                            for(int j = 1 ; j <= n ;++j){
                                if(park[j] == 0) {
                                    park[j] = waiting.poll(); //큐에서 빼서  주차장에 넣고
                                    result += w_pay.get(j) * c_weight.get(park[j]);
                                    cnt++; //차량 수 더함
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            sb.append("#" + test + " ").append(result).append("\n");
        }
        System.out.print(sb);
    }
}