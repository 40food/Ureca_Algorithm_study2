import java.util.Arrays;
import java.util.Stack;

public class Main_같은_숫자는_싫어 {
    static int[] arr={1,1,3,3,0,1,1};
    static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(stack.peek()==arr[i]) continue;
            stack.push(arr[i]);
        }
        System.out.println(Arrays.toString(stack.stream().mapToInt(Integer::intValue).toArray()));
    }
}
