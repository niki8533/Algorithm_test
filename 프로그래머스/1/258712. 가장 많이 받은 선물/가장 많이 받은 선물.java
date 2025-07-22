import java.util.*;

class Solution {
        public static int solution(String[] friends, String[] gifts) {
        int answer = 0;

        Map<String, Integer> map = new HashMap<>();
        for(int i = 0 ; i < friends.length ; i++){
            map.put(friends[i], i);
        }
        int n = friends.length;
        int[][] count = new int[n][n];
        int[] giftIndex = new int[n];
        int[] giveCount = new int[n];
        int[] receiveCount = new int[n];
        int[] result = new int[n];

        for(int i = 0 ; i < gifts.length ; i++){
            String[] giftTo = gifts[i].split(" ");
            count[map.get(giftTo[0])][map.get(giftTo[1])]++;
            giveCount[map.get(giftTo[0])]++;
            receiveCount[map.get(giftTo[1])]++;
        }

        for(int i = 0 ; i < n ; i++){
            giftIndex[i] = giveCount[i] - receiveCount[i];
        }

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(i != j){
                    if(count[i][j] > count[j][i]){
                        result[i]++;
                    } else if(count[i][j] == count[j][i]){
                        if(giftIndex[i] > giftIndex[j]){
                            result[i]++;
                        }
                    }
                }
            }
        }

        for(int i = 0 ; i < n ; i++){
            answer = Math.max(answer, result[i]);
        }


        return answer;
    }
}