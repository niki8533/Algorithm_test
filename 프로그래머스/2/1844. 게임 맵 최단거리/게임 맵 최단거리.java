import java.util.*;

class Solution {
    static int[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int n, m;
    public int solution(int[][] maps) {
        int answer = 0;
        
        n = maps.length;
        m = maps[0].length;
        
        visited = new int[n][m];
        
        bfs(maps);
        
        answer = visited[n-1][m-1];
        
        if(answer == 0){
            answer = -1;
        }
        
        return answer;
    }
    
    public static void bfs(int[][] maps){
        int x = 0;
        int y = 0;
        visited[x][y] = 1;
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        
        while(!q.isEmpty()){
            int[] current = q.poll();
            int cx = current[0];
            int cy = current[1];
            for(int i = 0 ; i < 4 ; i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if(nx >= 0 && nx < n && ny >= 0 && ny < m && maps[nx][ny] == 1 && visited[nx][ny] == 0){
                    visited[nx][ny] = visited[cx][cy] + 1;
                    q.add(new int[]{nx, ny});
                }
            }
        }
    }
}