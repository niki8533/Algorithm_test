//백준 - 강의실 배정

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];

        for(int i = 0 ; i < N ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int[] startArr = new int[N];
        int[] endArr = new int[N];

        for(int i = 0 ; i < N ; i++){
            startArr[i]= arr[i][0];
            endArr[i] = arr[i][1];
        }

        Arrays.sort(startArr);
        Arrays.sort(endArr);
        
        int start = 0;
        int end = 0;
        int current = 0;
        int maxRooms = 0;
        
        while(start < N){
            if(startArr[start] < endArr[end]){
                current++;
                maxRooms = Math.max(maxRooms, current);
                start++;
            } else {
                current--;
                end++;
            }
        }
        
        System.out.println(maxRooms);
    }
}
