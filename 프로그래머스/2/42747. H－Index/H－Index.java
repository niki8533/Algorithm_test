import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int n = citations.length;
        
        Arrays.sort(citations);
        
        boolean isH = false;
        int index = 0;
        while(!isH){
            if(answer >= (n - index) && answer <= citations[index]){
                isH = true;
                break;
            }
            
            if(answer < citations[index]){
                answer++;
            } else if(answer >= citations[index]){
                index++;
            }
            
            if(index >= citations.length){
                answer = 0;
                break;
            }
            
        }
        
        return answer;
    }
}