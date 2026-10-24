class Solution {
    static boolean[] visited;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[computers.length];
        
        for(int i = 0 ; i < n ; i++){
            if(!visited[i]){
                dfs(computers, n, i);
                answer++;
            }
        }
        return answer;
    }
    
    public static void dfs(int[][] computers, int n, int i){
        visited[i] = true;
        
        for(int j = 0 ; j < n ; j++){
            if(computers[i][j] == 1 && visited[j] == false){
                dfs(computers, n, j);
            }
        }
    }
}