import java.util.*;

class Solution {
    static List<int[]> list = new ArrayList<>();
    public int[][] solution(int n) {
        int[][] answer = {};

        hanoi(1, 2, 3, n);

        return list.toArray(new int[1][list.size()]);
    }
    
    public static void hanoi(int start, int mid, int end, int stack){
        if(stack == 1){
            list.add(new int[]{start, end});
            return;
        }

        hanoi(start, end, mid, stack-1);
        list.add(new int[]{start, end});
        hanoi(mid, start, end, stack-1);
    }
}