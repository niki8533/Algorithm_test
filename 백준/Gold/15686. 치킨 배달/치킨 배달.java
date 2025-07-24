import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//백준 - 치킨 배달
public class Main {
    static int m, answer;
    static List<Point> homes = new ArrayList<>();
    static List<Point> chickens = new ArrayList<>();
    static int[] selected;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        answer = Integer.MAX_VALUE;
        int[][] map = new int[n][n];
        selected = new int[m];


        for(int i = 0 ; i < n ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < n ; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == 1){
                    homes.add(new Point(i, j));
                }
                if(map[i][j] == 2){
                    chickens.add(new Point(i, j));
                }
            }
        }

        combination(0, 0);
        System.out.println(answer);

    }

    public static void combination(int depth, int start){
        if(depth == m){
            int total = 0;
            for(Point home : homes){
                int min = Integer.MAX_VALUE;
                for(int i = 0 ; i < m ; i++){
                    Point chicken = chickens.get(selected[i]);
                    int dist = Math.abs(home.x - chicken.x) + Math.abs(home.y - chicken.y);
                    min = Math.min(min, dist);
                }
                total += min;
            }

            answer = Math.min(answer, total);
            return;
        }

        for(int i = start ; i < chickens.size(); i++){
            selected[depth] = i;
            combination(depth + 1, i + 1);
        }
    }

    public static class Point {
        int x, y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
