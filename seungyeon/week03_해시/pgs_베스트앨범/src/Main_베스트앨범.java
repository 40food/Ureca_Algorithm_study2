import java.util.*;

public class Main_베스트앨범 {
    static String[] genres={"classic","pop","classic","classic","pop"};
    static int[] plays={500,600,150,800,2500};
    static void main(String[] args) {
        ArrayList<Integer> result=new ArrayList<>();
        HashMap<String,Integer> genrePlays=new HashMap<>();
        for(int i=0;i<genres.length;i++){
            genrePlays.put(genres[i], plays[i]+genrePlays.getOrDefault(genres[i],0));
        }
        PriorityQueue<Map.Entry<String,Integer>> genreRanking=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        for(Map.Entry<String,Integer> e:genrePlays.entrySet()){
            genreRanking.add(e);
        }
        for(Map.Entry<String,Integer> e:genreRanking){
            String nowGenre=e.getKey();
            PriorityQueue<int[]> playlist=new PriorityQueue<>((a,b)->b[1]-a[1]);
            for(int i=0;i<genres.length;i++){
                if(genres[i].equals(nowGenre)){ //string은 == 아니라 equals로 비교 주의
                    playlist.add(new int[]{i,plays[i]});
                }
            }
            result.add(playlist.poll()[0]);
            if(!playlist.isEmpty())result.add(playlist.poll()[0]);
        }
        System.out.println(result.stream().mapToInt(Integer::intValue).toArray());
    }
}
