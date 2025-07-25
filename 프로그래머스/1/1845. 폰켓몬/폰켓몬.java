import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int N = nums.length / 2;
        
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0 ; i < nums.length ; i++){
            set.add(nums[i]);
        }

        if(N < set.size()){
            answer = N;
        }
        else answer = set.size();
        
        return answer;
    }
}