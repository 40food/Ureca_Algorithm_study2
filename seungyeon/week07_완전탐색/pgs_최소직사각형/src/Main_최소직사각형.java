public class Main_최소직사각형 {
    static int[][] sizes={{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
    static void main(String[] args) {
        int width=0;
        int height=0;
        for(int i=0;i<sizes.length;i++){
            if(sizes[i][0]>sizes[i][1]){ //가로가 긺
                if(width<sizes[i][0]) width=sizes[i][0];
                if(height<sizes[i][1]) height=sizes[i][1];
            }else{ //세로가 길거나 같음-돌림
                if(width<sizes[i][1]) width=sizes[i][1];
                if(height<sizes[i][0]) height=sizes[i][0];
            }
        }
        System.out.println(width*height);
    }
}
