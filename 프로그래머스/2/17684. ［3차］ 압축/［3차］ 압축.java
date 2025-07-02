import java.util.*;

class Solution {
    public int[] solution(String msg) {
        int[] answer = {};
        
        List<Integer> ans = new ArrayList<>();
        List<String> dict = new ArrayList<>();

        char c = 'A';
        for(int i = 0 ; i < 26 ; i++){
            dict.add(String.valueOf(c));
            c++;
        }

        int i = 0;
        while(i < msg.length()){
            int temp = 0;
            String s = "";
            for(int j = i+1 ; j <msg.length()+1 ; j++){
                s = msg.substring(i, j);
                if(dict.contains(s)){
                    temp = dict.indexOf(s) + 1;
                } else {
                    ans.add(temp);
                    dict.add(s);
                    i = j - 1;
                    break;
                }

                if(j == msg.length()){
                    ans.add(temp);
                    i = msg.length();
                }
            }
        }

        answer = new int[ans.size()];
        for(int k = 0 ; k < ans.size() ; k++){
            answer[k] = ans.get(k);
        }
        return answer;
    }
}