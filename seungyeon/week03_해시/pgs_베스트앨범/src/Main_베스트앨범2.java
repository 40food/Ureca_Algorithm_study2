import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Main_베스트앨범2 {
    static String[] genres={"classic","pop","classic","classic","pop"};
    static int[] plays={500,600,150,800,2500};
    static void main(String[] args) {
        ArrayList<Integer> result=new ArrayList<>();
        HashMap<String,Integer> genrePlays=new HashMap<>();
        for(int i=0;i<genres.length;i++){
            genrePlays.put(genres[i], plays[i]+genrePlays.getOrDefault(genres[i],0));
        }
        ArrayList<Map.Entry<String,Integer>> genreRanking=new ArrayList<>();
        genreRanking.sort((a,b)->b.getValue()-a.getValue());
        for(Map.Entry<String,Integer> e:genrePlays.entrySet()){
            genreRanking.add(e);
        }
        for(Map.Entry<String,Integer> e:genreRanking){
            String nowGenre=e.getKey();
            ArrayList<int[]> playlist=new ArrayList<>();
            for(int i=0;i<genres.length;i++){
                if(genres[i].equals(nowGenre)){ //string은 == 아니라 equals로 비교 주의
                    playlist.add(new int[]{i,plays[i]});
                }
            }
            playlist.sort((a,b)->{
                if(a[1]==b[1]) return a[0]-b[0];
                return b[1]-a[1];
            });
            result.add(playlist.get(0)[0]);
            if(playlist.size()>1)result.add(playlist.get(1)[0]);
        }
        System.out.println(result.stream().mapToInt(Integer::intValue).toArray());
    }
}
