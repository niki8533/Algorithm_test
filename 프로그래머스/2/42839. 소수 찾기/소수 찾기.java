import java.util.*;

class Solution {
    static boolean[] visited;
    static Set<Integer> set;
    
    public int solution(String numbers) {
        int answer = 0;
        
        visited = new boolean[numbers.length()];
        set = new HashSet<>();

        dfs(numbers, 0, "");

        for(int temp : set){
            if(isPrime(temp)){
                answer++;
            }
        }
        return answer;
    }
    
     static void dfs(String numbers, int depth, String s){
        if(depth > numbers.length()){
            return;
        }

        for(int i = 0 ; i < numbers.length() ; i++){
            if(!visited[i]){
                visited[i] = true;
                set.add(Integer.parseInt(s + numbers.charAt(i)));
                dfs(numbers, depth+1, s + numbers.charAt(i));
                visited[i] = false;
            }
        }
    }

    static boolean isPrime(int temp){
        if(temp < 2){
          return false;
        }

        for(int i = 2 ; i <= (int)Math.sqrt(temp) ; i++){
            if(temp % i == 0){
                return false;
            }
        }

        return true;
    }
}