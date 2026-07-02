import java.util.ArrayList;

public class Main_모의고사 {
    static int[] answers={1,3,2,4,2};
    static int[] a = {1,2,3,4,5};
    static int[] b = {2,1,2,3,2,4,2,5};
    static int[] c = {3,3,1,1,2,2,4,4,5,5};
    static void main(String[] args) {
        int aAnswer=0,bAnswer=0,cAnswer=0;
        for(int i=0;i<answers.length;i++){
            if(answers[i]==a[i%a.length]) aAnswer++;
            if(answers[i]==b[i%b.length]) bAnswer++;
            if(answers[i]==c[i%c.length]) cAnswer++;
        }
        int max=Math.max(aAnswer,Math.max(bAnswer,cAnswer));
        ArrayList<Integer> result=new ArrayList<>();
        if(aAnswer==max) result.add(1);
        if(bAnswer==max) result.add(2);
        if(cAnswer==max) result.add(3);
        System.out.println(result.stream().mapToInt(Integer::intValue).toArray());
    }
}
