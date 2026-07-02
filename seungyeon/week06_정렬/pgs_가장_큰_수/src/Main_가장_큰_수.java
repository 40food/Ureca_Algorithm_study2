import java.util.ArrayList;

public class Main_가장_큰_수 {
    static int[] numbers={3, 30, 34, 5, 9};

    static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<>();
        for(int i=0;i< numbers.length;i++){
            array.add(numbers[i]);
        }
        array.sort((a,b)->{
            int aFirst=Integer.parseInt(a.toString()+b.toString());
            int bFirst=Integer.parseInt(b.toString()+a.toString());
            if(aFirst>bFirst) return -1;
            else if(aFirst<bFirst) return 1;
            else return 0;
        });
        StringBuilder result=new StringBuilder();
        boolean isZero=true;
        for(int a:array){
            if(a!=0) isZero=false;
            result.append(a);
        }
        System.out.println(isZero?"0":result);
    }
}
