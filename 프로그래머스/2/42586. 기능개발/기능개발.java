import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int[] works = new int[progresses.length];
        
        for(int i = 0 ; i < speeds.length ; i++){
            works[i] = (100 - progresses[i]) / speeds[i];
            
            if((100 - progresses[i]) % speeds[i] != 0){
                works[i]++;
            }
        }
        
        int index = 0;
        int count = 1;
        List<Integer> list = new ArrayList<>();
        for(int i = 1 ; i < works.length ; i++){
            if(works[index] >= works[i]){
                count++;
            } else {
                list.add(count);
                index = i;
                count = 1;
            }
        }
        
        list.add(count);
        
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}