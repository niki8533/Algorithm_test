import java.util.*;

public class Main {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static boolean[][] visited = new boolean[10][10];
    static char[][] boards = new char[10][10];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lx = 0;
        int ly = 0;
        for (int i = 0; i < 10; i++) {
            String board = sc.next();
            for(int j = 0 ; j < 10 ; j++){
                char c = board.charAt(j);
                boards[i][j] = c;
                if(c == 'L'){
                    lx = i;
                    ly = j;
                }
            }
        }

        int answer = bfs(lx, ly);
        System.out.println(answer);
    }

    public static int bfs(int sx, int sy){
        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[]{sx, sy, 0});
        visited[sx][sy] = true;

        while(!q.isEmpty()){
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            int d = cur[2];

            if(boards[x][y] == 'B'){
                return d - 1;
            }

            for(int i = 0 ; i < 4 ; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx >= 0 && nx < 10 && ny >= 0 && ny < 10 && !visited[nx][ny] && boards[nx][ny] != 'R'){
                    visited[nx][ny] = true;
                    q.offer(new int[]{nx, ny, d + 1});
                }
            }
        }
        return -1;
    }
}