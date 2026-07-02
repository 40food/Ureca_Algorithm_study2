import java.util.HashMap;
import java.util.Map;

public class Main_의상 {
    static String[][] clothes={{"yellow_hat", "headgear"},
            {"blue_sunglasses", "eyewear"},
            {"green_turban", "headgear"}};
    static void main(String[] args) {
        HashMap<String, Integer> map=new HashMap<>();
        for(String[] c:clothes){
            map.put(c[1],map.getOrDefault(c[1],0)+1);
        }
        int result=1;
        for(Map.Entry<String,Integer> m:map.entrySet()){
            result*=m.getValue()+1;
        }
        System.out.println(result-1);
    }
}
