import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int n = 0 ; n < commands.length ; n++){
            int i = commands[n][0] - 1;
            int j = commands[n][1] - 1;
            int k = commands[n][2] - 1;
            
            int temp = 0;
            List<Integer> list = new ArrayList<>();
            for(int m = i ; m <= j ; m++){
                list.add(array[m]);
            }
            
            Collections.sort(list);
            answer[n] = list.get(k);
        }
        return answer;
    }
}