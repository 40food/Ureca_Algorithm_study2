import java.util.*;
public class Main2_모의고사 {
    public int[] solution(int[] answers) {

        /**
         1번 수포자 12345
         2번 수포자 21232425
         3번 수포자 3311224455
         */

        int a=0;
        int b=0;
        int c=0;
        for(int i=0;i<answers.length;i++){
            switch(i%5){
                case 0: if(answers[i]==1) a++; break;
                case 1: if(answers[i]==2) a++; break;
                case 2: if(answers[i]==3) a++; break;
                case 3: if(answers[i]==4) a++; break;
                case 4: if(answers[i]==5) a++; break;
            }
            switch(i%8){
                case 0: if(answers[i]==2) b++; break;
                case 1: if(answers[i]==1) b++; break;
                case 2: if(answers[i]==2) b++; break;
                case 3: if(answers[i]==3) b++; break;
                case 4: if(answers[i]==2) b++; break;
                case 5: if(answers[i]==4) b++; break;
                case 6: if(answers[i]==2) b++; break;
                case 7: if(answers[i]==5) b++; break;
            }
            switch(i%10){
                case 0: if(answers[i]==3) c++; break;
                case 1: if(answers[i]==3) c++; break;
                case 2: if(answers[i]==1) c++; break;
                case 3: if(answers[i]==1) c++; break;
                case 4: if(answers[i]==2) c++; break;
                case 5: if(answers[i]==2) c++; break;
                case 6: if(answers[i]==4) c++; break;
                case 7: if(answers[i]==4) c++; break;
                case 8: if(answers[i]==5) c++; break;
                case 9: if(answers[i]==5) c++; break;
            }
        }

        ArrayList<Integer> ans=new ArrayList<>();
        //최고 점수는 Math.max로 찾기
        int max=Math.max(a,Math.max(b,c));
        int[] temp={a,b,c};
        for(int i=0;i<3;i++){
            if(temp[i]==max) ans.add(i+1);
        }
        int[] answer=ans.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
