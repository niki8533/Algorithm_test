import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        int total = brown + yellow;

        for(int i = 1 ; i <= total ; i++){
            if(total % i == 0){
                list.add(i);
            }
        }

        int w = 0;
        int h = 0;

        if(list.size() % 2 == 0){
            for(int i = 0 ; i < list.size() / 2 ; i++){
                w = list.get(i);
                h = list.get(list.size() - i - 1);

                if((w-2)*(h-2) == yellow)
                    break;
            }
        } else{
            h = w = list.get(list.size()/2);
        }

        answer = new int[2];
        answer[0] = h;
        answer[1] = w;
        
        return answer;
    }
}