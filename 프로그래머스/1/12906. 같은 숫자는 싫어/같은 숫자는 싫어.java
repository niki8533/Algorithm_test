import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
         int[] answer;

        Stack<Integer> stack = new Stack<>();

        stack.add(arr[0]);
        for(int i = 1 ; i < arr.length ; i++){
            if(stack.peek() != arr[i]) {
                stack.add(arr[i]);
            }
        }

        answer = new int[stack.size()];
        int temp = stack.size() - 1;
        while(!stack.isEmpty()){
            answer[temp--] = stack.pop();
        }
        
        return answer;
    }
}