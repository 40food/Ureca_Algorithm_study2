import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class Main_프로세스 {
    static int[] priorities={1, 1, 9, 1, 1, 1};
    static int location=0;
    static void main(String[] args) {
        Queue<int[]> queue=new ArrayDeque<>();
        for(int i=0;i< priorities.length;i++){
            if(i==location) queue.add(new int[]{priorities[i],1});
            else queue.add(new int[]{priorities[i],0});
        }
        int result=0;
        while(!queue.isEmpty()){
            int highest=0;
            for(int[] q:queue){
                if(q[0]>highest)highest=q[0];
            }
            int[] now=queue.poll();
            if(now[0]==highest){
                result++;
                if(now[1]==1) break;
            }
            else{
                queue.add(now);
            }
        }
        System.out.println(result);
    }
}
