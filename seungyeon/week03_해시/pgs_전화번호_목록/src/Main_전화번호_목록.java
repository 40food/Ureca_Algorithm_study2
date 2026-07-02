import java.util.Arrays;
import java.util.HashSet;

public class Main_전화번호_목록 {
    static String[] phone_book={"119", "97674223", "1195524421"};
    static void main(String[] args) {
        Arrays.sort(phone_book);
        boolean result=true;
        for(int i=0;i<phone_book.length-1;i++){
            result=!phone_book[i+1].startsWith(phone_book[i]);
            if(!result) break;
        }
        System.out.println(result);
    }
}
