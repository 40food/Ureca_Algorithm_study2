import java.util.ArrayList;

public class Main_K번째수2 {
    static int[] array={1,5,2,6,3,7,4};
    static int[][] commands={{2,5,3},{4,4,1},{1,7,3}};
    static void main(String[] args) {
        int[] answer = new int[commands.length]; //배열 사이즈 재정의 필요

        /**1. array에서 i부터 j까지 자른다.
         2. 자른 부분을 정렬한다.
         3. k 위치에 있는 값을 return한다.*/

        for(int i=0;i<commands.length;i++){
            //int 배열에 값을 넣기 위해 int n:m이 아니라 해당 형태 선택
            int[] command_line=commands[i];
            ArrayList<Integer> temp=new ArrayList<>();
            for(int j=0;j<array.length;j++){
                //i-1 위치와 j-1 위치 사이 값만 add (index는 0부터니까)
                //array[j]와 비교했었는데 그럼 내부 값으로 비교하는거라 안 됨
                if(j>=command_line[0]-1&&
                        j<=command_line[1]-1) temp.add(array[j]);
            }
            temp.sort((a,b)->a-b); //오름차순 정렬
            answer[i]=temp.get(command_line[2]-1);
        }
        System.out.println(answer);
    }
}
