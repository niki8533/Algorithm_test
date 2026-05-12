import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        
        int max = 0;
        for(int i = 0 ; i < N ; i++){
            int count = 1;
            int sum = B - (arr[i]/2);
            for(int j = 0 ; j < N ; j++){
                if(i == j){
                    continue;
                }

                if(sum - arr[j] < 0){
                    break;
                }

                sum -= arr[j];
                count++;
            }

            max = Math.max(max, count);
        }

        System.out.println(max);
    }
}