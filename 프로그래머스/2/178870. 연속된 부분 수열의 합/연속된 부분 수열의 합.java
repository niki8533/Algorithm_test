import java.util.*;

class Solution {
    public static int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];

        //포인터
        int l = 0;
        int r = 0;

        //합계값
        int sum = 0;
        int count = sequence.length;

        for(r = 0 ; r < sequence.length ; r++){
            sum = sum + sequence[r];

            while(r < sequence.length && sum > k) {
                sum = sum - sequence[l];
                l++;
            }

            if(sum == k){
                if(count > r - l){
                    count = r - l;
                    answer[0] = l;
                    answer[1] = r;
                }
            }
        }

        return answer;
    }
}