import java.util.*;

class Solution {
    static boolean[] visited;
    static List<Integer>[] graph;
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        graph = new ArrayList[n + 1];
        
        for(int i = 1 ; i <= n ; i++){
            graph[i] = new ArrayList<>();
        }
        
        for(int i = 0 ; i < wires.length ; i++){
            int v1 = wires[i][0];
            int v2 = wires[i][1];
            
            graph[v1].add(v2);
            graph[v2].add(v1);
        }
        
        for(int i = 0 ; i < wires.length ; i++){
            int v1 = wires[i][0];
            int v2 = wires[i][1];
            
            visited = new boolean[n + 1];

            
            graph[v1].remove(Integer.valueOf(v2));
            graph[v2].remove(Integer.valueOf(v1));
            
            int cnt = dfs(1);
            
            int diff = Math.abs(cnt - (n - cnt));
            answer = Math.min(answer, diff);
            
            graph[v1].add(v2);
            graph[v2].add(v1);
        }
        return answer;
    }
    
    public static int dfs(int v){
        visited[v] = true;
        int count = 1;
        
        for(int next : graph[v]){
            if(!visited[next]){
                count += dfs(next);
            }
        }
        
        return count;
    }
}