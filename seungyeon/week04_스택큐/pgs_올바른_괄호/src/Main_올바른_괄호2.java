public class Main_올바른_괄호2 {
    static String s=")()(";
    static void main(String[] args) {
        boolean answer = true;

        /**
         스택을 써서 (면 넣고 )면 지우기
         그렇게 해서 stack이 0이 되면 true 아니면 false
         */

        String[] ss=s.split("");

        int left=0;

        for(String o:ss){
            if(o.startsWith("(")) left++;
            else {
                if(left<=0) {answer=false; break;}
                else left--;
            };
        }

        if(left!=0) answer=false;

        System.out.println(answer);
    }
}
