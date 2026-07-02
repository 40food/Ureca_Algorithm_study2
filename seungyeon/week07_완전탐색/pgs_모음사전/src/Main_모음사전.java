import java.util.ArrayDeque;
import java.util.Queue;

public class Main_모음사전 {
    static String word="I";
    static String[] alpha={"A","E","I","O","U"};
    static StringBuilder sb;
    static int count;
    static void main(String[] args) {
        count=0;
        sb=new StringBuilder();
        putAlpha(0, 0);
        System.out.println(count);
    }

    static void putAlpha(int position, int next_alpha){
        if(sb.toString().length()==5||sb.toString().equals(word)){
            return;
        }
        sb.append(alpha[next_alpha]);
        count++;
        for(int i=0;i<5;i++){
            putAlpha(position+1,i);
            if(sb.toString().equals(word)) break; //필수
            sb.delete(position,position+1);
        }
    }
}
