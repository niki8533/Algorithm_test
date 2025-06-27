import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;        
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0 ; i < phone_book.length ; i++){
            map.put(phone_book[i], phone_book[i].length());
        }

        for(int i = 0 ; i < phone_book.length ; i++){
            for(int j = 0 ; j < phone_book[i].length() ; j++){
                String temp = phone_book[i].substring(0, j);
                if(map.containsKey(temp)){
                    answer = false;
                    break;
                }
            }
        }
        
        return answer;
    }
}