import java.util.HashMap;
import java.util.Map;

public class Main_완주하지_못한_선수 {
    static String[] participant={"leo","kiki","eden"};
    static String[] completion={"eden","kiki"};

    static void main(String[] args) {
        HashMap<String,Integer> h=new HashMap<>();
        for(String s:participant){
            h.put(s,h.getOrDefault(s,0)+1);
        }
        for(String s:completion){
            h.put(s,h.get(s)-1);
        }
        String result="";
        for(Map.Entry<String,Integer> e:h.entrySet()){ //Set<Entry<String,Integer>>
            if(e.getValue()==1) result=e.getKey();
        }
        System.out.println(result);
    }
}
