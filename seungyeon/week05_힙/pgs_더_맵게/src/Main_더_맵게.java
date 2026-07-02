import java.util.PriorityQueue;

public class Main_더_맵게 {
    static int[] scoville={1,2,3,9,10,12};
    static int K=7;
    static void main(String[] args) {
        int answer=0;
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        for(int i=0;i<scoville.length;i++){
            queue.add(scoville[i]);
        }
        while(!queue.isEmpty()&&queue.peek()<K){ //peek로 판단하는 편이 간단함
            int now=queue.poll();
            if(!queue.isEmpty()){
                int next=queue.poll();
                queue.add(now+next*2);
                answer++;
            }else{
                answer=-1;
                break;
            }
        }
        System.out.println(answer);
    }
}
