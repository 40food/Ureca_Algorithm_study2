import java.util.ArrayList;

public class Main_기능개발 {
    static int[] progresses={95, 90, 99, 99, 80, 99};
    static int[] speeds={1, 1, 1, 1, 1, 1};
    static void main(String[] args) {
        ArrayList<Integer> result=new ArrayList<>();
        int working_time=0;
        int count=0;
        for(int i=0;i<progresses.length;i++){
            working_time=(100-progresses[i])/speeds[i];
            if((100-progresses[i])%speeds[i]>0) working_time++;
            for(int j=i;j< progresses.length;j++){
                if(progresses[j]+(speeds[j]*working_time)>=100){
                    count++;
                    i++;
                }else{
                    result.add(count);
                    working_time=0;
                    count=0;
                    break;
                }
            }
            i--;
        }
        result.add(count);
        System.out.println(result.stream().mapToInt(Integer::intValue).toArray());
    }
}
