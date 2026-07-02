import java.util.HashSet;

public class Main_폰켓몬 {

    static int[] nums={3,1,2,3};

    static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int result=0;
        if(set.size()<nums.length/2){
            result=set.size();
        }else{
            result=nums.length/2;
        }
        System.out.println(result);
    }
}
