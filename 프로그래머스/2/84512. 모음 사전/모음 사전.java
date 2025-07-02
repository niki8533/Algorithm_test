import java.util.*;

class Solution {
    static List<String> list;
    static String[] dict = {"A", "E", "I", "O", "U"};
    
    public static int solution(String word) {
        int answer = 0;
        list = new ArrayList<>();

        dfs("", 0);

        for(int i = 0 ; i < list.size() ; i++){
            if(list.get(i).equals(word)){
                answer = i;
                break;
            }
        }

        return answer;
    }

    public static void dfs(String word, int depth){
        list.add(word);
        if(depth == 5){
            return;
        }

        for(int i = 0 ; i < 5 ; i++){
            dfs(word + dict[i], depth + 1);
        }
    }
}