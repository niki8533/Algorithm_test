import java.util.*;

class Solution {
    static int[] visited;
    static int answer;
    public int solution(String begin, String target, String[] words) {
        answer = 0;
        int n = words.length;
        visited = new int[n];
        bfs(begin, target, words, n);
        
        for(int i = 0 ; i < n ; i++){
            System.out.println(visited[i]);
        }
        
        return answer;
    }
    
    public static void bfs(String begin, String target, String[] words, int n){
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(begin, 0));
        
        while(!q.isEmpty()){
            Node node = q.poll();
            String cw = node.cw;
            int index = node.index;
            
            if(cw.equals(target)){
                answer = visited[index];
                return;
            }
            
            for(int j = 0 ; j < n ; j++){
                String nw = words[j];
                
                int spell = 0;
                for(int i = 0 ; i < nw.length() ; i++){
                    if(cw.charAt(i) == nw.charAt(i)){
                        spell++;
                    }
                }
                
                if(spell == (nw.length() - 1) && visited[j] == 0){
                    visited[j] = visited[index] + 1;
                    q.offer(new Node(nw, j));
                }
                
            }
        }
    }
    
    static class Node{
        String cw;
        int index;
        
        public Node(String cw, int index){
            this.cw = cw;
            this.index = index;
        }
    }
}