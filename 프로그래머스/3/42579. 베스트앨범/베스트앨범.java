import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, HashMap<Integer, Integer>> music = new HashMap<>();
        
        for(int i = 0 ; i < genres.length ; i++){
            if(!map.containsKey(genres[i])){
                HashMap<Integer, Integer> num = new HashMap<>();
                num.put(i, plays[i]);
                music.put(genres[i], num);
                map.put(genres[i], plays[i]);
            } else {                
                music.get(genres[i]).put(i, plays[i]);
                map.put(genres[i], (map.get(genres[i]) + plays[i]));
            }
        }
        
        List<String> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet, (o1, o2) -> map.get(o2) - map.get(o1));
        
        List<Integer> list = new ArrayList<>();
        for(String key : keySet){
            HashMap<Integer, Integer> num = music.get(key);
            
            List<Integer> genreKey = new ArrayList<>(num.keySet());
            Collections.sort(genreKey, (o1, o2) -> num.get(o2) - num.get(o1));
            
            list.add(genreKey.get(0));
            if(genreKey.size() > 1){
                list.add(genreKey.get(1));
            }
        }
        
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}