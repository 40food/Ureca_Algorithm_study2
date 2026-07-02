import java.util.ArrayDeque;
import java.util.Queue;

public class Main_다리를_지나는_트럭 {
    static int bridge_length=2;
    static int weight=10;
    static int[] truck_weights={7,4,5,6};

    static void main(String[] args) {
        int result=0;
        int complete_truck=0;
        int now_weight=0;
        int next_truck_position=0; //stack이나 배열 사용 대신
        Queue<Integer> q=new ArrayDeque<>();
        for(int i=0;i<bridge_length;i++){
            q.add(0);
        }
        while(complete_truck<truck_weights.length){
            // 시간 지나고 트럭 하나 분량 빠짐
            result++;
            int out_truck=q.poll();
            if(out_truck>0){
                complete_truck++;
                now_weight-=out_truck;
            }
            //트럭 진입
            //다음 트럭이 진입했을 때 하중이 다리 하중보다 작거나 같은 경우-트럭 넣음
            if(next_truck_position<truck_weights.length
                    &&truck_weights[next_truck_position]+now_weight<=weight){ //next_truck_position을 뒤에서 검사하면 앞단땜에 항상 true
                q.add(truck_weights[next_truck_position]);
                now_weight+=truck_weights[next_truck_position];
                next_truck_position++;
            }
            //다음 트럭이 진입했을 때 하중이 다리 하중보다 큰 경우-0 넣음
            else{
                q.add(0);
            }
        }
        System.out.println(result);
    }
}
