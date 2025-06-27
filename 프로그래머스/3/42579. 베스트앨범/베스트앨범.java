import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        ArrayList<Integer> answer = new ArrayList<>();

        HashMap<String, Integer> num = new HashMap<>();
        HashMap<String, HashMap<Integer, Integer>> music = new HashMap<>();

        for(int i = 0 ; i < genres.length ; i++){
            if(!num.containsKey(genres[i])){
                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(i, plays[i]);
                music.put(genres[i], map);
                num.put(genres[i], plays[i]);
            } else {
                music.get(genres[i]).put(i, plays[i]);
                num.put(genres[i], num.getOrDefault(genres[i], 0) + plays[i]);
            }
        }

        List<String> keySet = new ArrayList<>(num.keySet());
        Collections.sort(keySet, (o1, o2) -> num.get(o2) - num.get(o1));

        for(String key: keySet){
            HashMap<Integer, Integer> map = music.get(key);

            List<Integer> genre_key = new ArrayList<>(map.keySet());
            Collections.sort(genre_key, (o1, o2) -> map.get(o2) - map.get(o1));

            answer.add(genre_key.get(0));
            if(genre_key.size() > 1)
                answer.add(genre_key.get(1));
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}