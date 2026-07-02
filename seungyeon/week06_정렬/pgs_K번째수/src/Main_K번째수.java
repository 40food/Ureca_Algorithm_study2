import java.util.ArrayList;
import java.util.Arrays;

public class Main_K번째수 {
    static int[] array={1,5,2,6,3,7,4};
    static int[][] commands={{2,5,3},{4,4,1},{1,7,3}};
    static void main(String[] args) {
        ArrayList<Integer> result=new ArrayList<>();
        for(int[] c:commands){
            int start=c[0];
            int end=c[1];
            int k=c[2];
            ArrayList<Integer> temp=new ArrayList<>();
            for(int i=start-1;i<end;i++){
                temp.add(array[i]);
            }
            temp.sort((a,b)->a-b);
            result.add(temp.get(k-1));
        }
        result.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(result);
    }
}
