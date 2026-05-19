import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][2];
        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (o1, o2) ->{
            return (o1[0]+o1[1]) - (o2[0]+o2[1]);
        });

        int max = 0;
        for(int i = 0 ; i < N ; i++){
            int sum = B - ((arr[i][0] / 2) + arr[i][1]);
            int count = 1;
            for(int j = 0 ; j < N ; j++){
                if(i == j){
                    continue;
                }
                if(sum - (arr[j][0] + arr[j][1]) < 0){
                    break;
                }
                else {
                    sum -= (arr[j][0] + arr[j][1]);
                    count++;
                }
            }

            //System.out.println(count);
            max = Math.max(max, count);
        }

        System.out.println(max);
    }
}