import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];

        int minX = Integer.MAX_VALUE;
        int maxX = 0;
        
        int minY = Integer.MAX_VALUE;
        int maxY = 0;
        for(int i = 0 ; i < N ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());

            minX = Math.min(minX, arr[i][0]);
            maxX = Math.max(maxX, arr[i][0]);

            minY = Math.min(minY, arr[i][1]);
            maxY = Math.max(maxY, arr[i][1]);
        }

        int midX = (minX + maxX) / 2;
        int midY = (minY + maxY) / 2;

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        for(int i = 0 ; i < N ; i++){
            if(arr[i][0] >= minX && arr[i][0] < midX && arr[i][1] >= minY && arr[i][1] < midY){
                count1++;
            }
            else if(arr[i][0] >= midX && arr[i][0] <= maxX && arr[i][1] >= minY && arr[i][1] < midY){
                count2++;
            }
            else if(arr[i][0] >= minX && arr[i][0] < midX && arr[i][1] >= midY && arr[i][1] <= maxY){
                count3++;
            }
            else if(arr[i][0] >= midX && arr[i][0] <= maxX && arr[i][1] >= midY && arr[i][1] <= maxY){
                count4++;
            }
        }

        System.out.println(Math.max(count1, Math.max(count2, Math.max(count3, count4))));
    }
}