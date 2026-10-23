import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        if(bridge_length == 1){
            return truck_weights.length + 1;
        }
        if(truck_weights.length == 1){
            return bridge_length + 1;
        }
        
        Queue<Integer> q = new LinkedList<>();
        int bridge = 0;
        for(int i = 0 ; i < truck_weights.length ; i++){
            while(true){
                if(q.isEmpty()){
                    q.offer(truck_weights[i]);
                    bridge += truck_weights[i];
                    answer++;
                    break;
                } else if(bridge_length == q.size()){
                    bridge -= q.poll();
                }
                else {
                    if(bridge + truck_weights[i] <= weight){
                        q.offer(truck_weights[i]);
                        bridge += truck_weights[i];
                        answer++;
                        break;
                    }
                    else {
                        q.offer(0);
                        answer++;
                    }
                }
            }
        }
        return answer + bridge_length;
    }
}