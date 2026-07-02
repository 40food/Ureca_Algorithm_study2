import java.util.Arrays;

public class Main_HIndex {
    static int[] citations={3,0,6,1,5};
    static void main(String[] args) {
        int result=-1;
        Arrays.sort(citations);
        for(int i=citations.length;i>=0;i--){
            int count=0;
            for(int j=citations.length-1;j>=0;j--){
                if(i>citations[j]) break;
                count++;
            }
            if(count>=i) {
                result=i; //아;; count가 아니라 i여야함
                break;
            }
        }
        System.out.println(result);
    }
}
