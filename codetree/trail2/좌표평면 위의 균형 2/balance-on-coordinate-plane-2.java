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

        int answer = Integer.MAX_VALUE;
        for(int x = minX ; x <= maxX ; x++){
            for(int y = minY ; y <= maxY ; y++){
                int count1 = 0;
                int count2 = 0;
                int count3 = 0;
                int count4 = 0;

                for(int i = 0 ; i < N ; i++){
                    if(arr[i][0] < x && arr[i][1] < y) count1++;
                    else if(arr[i][0] < x && arr[i][1] >= y) count2++;
                    else if(arr[i][0] >= x && arr[i][1] < y) count3++;
                    else count4++;
                }
                int max = Math.max(count1, Math.max(count2, Math.max(count3, count4)));
                answer = Math.min(answer, max);
            }
        }

        System.out.println(answer);

    }
}