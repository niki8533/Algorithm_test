class Solution {
    static boolean[] visited;
    static int answer = -1;
    
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];

        dfs(0, k, dungeons);
        
        return answer;
    }
    
    static void dfs(int depth, int piro, int[][] dungeons){
        for(int i = 0 ; i < dungeons.length ; i++){
            if(visited[i] || dungeons[i][0] > piro){
                continue;
            }

            visited[i] = true;
            dfs(depth + 1, piro - dungeons[i][1], dungeons);
            visited[i] = false;
        }

        answer = Math.max(answer, depth);
    }
}