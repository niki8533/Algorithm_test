import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][2];
        
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        // Please write your code here.
        Arrays.sort(arr, (o1, o2) -> {
            int first = o1[0] + o1[1];
            int second = o2[0] + o2[1];

            return first - second;
        });

        int max = 0;
        for(int i = 0 ; i < n ; i++){
            int sum = b - ((arr[i][0] / 2) + arr[i][1]);
            int count = 1;
            for(int j = 0 ; j < n ; j++){
                if(i == j){
                    continue;
                }

                sum -= (arr[j][0] + arr[j][1]);

                if(sum < 0){
                    break;
                }

                count++;
            }

            max = Math.max(max, count);
        }

        System.out.println(max);
    }
}