import java.util.Stack;

public class Main_올바른_괄호 {
    static String s=")()(";
    static void main(String[] args) {
        boolean result=true;
        Stack<String> stack=new Stack<>();
        String[] list=s.split("");
        for(String l:list){
            if(l.equals("(")) stack.push("(");
            else {
                if(stack.isEmpty()) {
                    result=false;
                    break;
                }
                stack.pop();
            }
        }
        if(stack.size()>0) result=false;
        System.out.println(result);
    }
}
