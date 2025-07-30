import javax.sound.sampled.Line;
import java.util.*;
import java.io.*;
//백준 - 뱀
public class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] visited;
    static Deque<Point> snake = new LinkedList<>();
    static int n;
    static int[][] arr;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        visited = new boolean[n][n];

        int k = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < k ; i++){
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken()) - 1;
            int c = Integer.parseInt(st.nextToken()) - 1;

            arr[r][c] = 1;
        }

        int l = Integer.parseInt(br.readLine());
        Queue<DirChange> dirQueue = new LinkedList<>();
        for(int i = 0 ; i < l ; i++){
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            String d = st.nextToken();
            dirQueue.offer((new DirChange(t, d)));
        }

        System.out.println(simulate(dirQueue));

    }

    static class Point {
        int x;
        int y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    static class DirChange {
        int time;
        String dir;
        DirChange(int time, String dir){
            this.time = time;
            this.dir = dir;
        }

    }

    static int simulate(Queue<DirChange> dirQueue){
        int time = 0;
        int d = 0;
        snake.offerFirst(new Point(0, 0));
        visited[0][0] = true;

        while(true){
            time++;

            Point head = snake.peekFirst();
            int nx = head.x + dx[d];
            int ny = head.y + dy[d];

            if(nx < 0 || ny < 0 || nx >= n || ny >= n || visited[nx][ny]){
                break;
            }

            snake.offerFirst(new Point(nx, ny));
            visited[nx][ny] = true;

            if(arr[nx][ny] == 1){
                arr[nx][ny] = 0;
            } else {
                Point tail = snake.pollLast();
                visited[tail.x][tail.y] = false;
            }

            if(!dirQueue.isEmpty() && dirQueue.peek().time == time){
                String cd = dirQueue.poll().dir;
                if(cd.equals("L")){
                    d = (d + 3) % 4;
                } else {
                    d = (d + 1) % 4;
                }
            }
        }

        return time;
    }
}
