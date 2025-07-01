import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

       Stack<Character> stack = new Stack<>();

        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);

            if(c == '('){
                stack.add(c);
            } else if(c == ')'){
                if(stack.isEmpty()){
                    answer = false;
                    return answer;
                } else if(stack.peek() == '('){
                    stack.pop();
                }
            }
        }

        if(stack.size() != 0){
            answer = false;
        }

        return answer;
    }
}