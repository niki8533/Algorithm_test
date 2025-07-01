import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Queue<Integer> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();

        for(int i = 0 ; i < speeds.length ; i++){
            double remain = (100 - progresses[i]) / (double)speeds[i];
            int day = (int)Math.ceil(remain);

            if(!q.isEmpty() && q.peek() < day){
                ans.add(q.size());
                q.clear();
            }

            q.offer(day);
        }

        ans.add(q.size());

        answer = new int[ans.size()];

        int index = 0;
        for(int answers: ans){
            answer[index++] = answers;
        }
        
        return answer;
    }
}