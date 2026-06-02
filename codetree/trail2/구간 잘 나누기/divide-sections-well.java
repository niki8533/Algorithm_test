import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        int start = 0;
        int end = 0;
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            start = Math.max(start, arr[i]);
            end += arr[i];
        }

        int mid = 0;
        while(start <= end){
            mid = (start + end) / 2;

            boolean isPossible = false;
            int count = 0;
            int sum = 0;
            for(int i = 0 ; i < N ; i++){
                sum += arr[i];

                if(sum == mid){
                    isPossible = true;
                    count++;
                    sum = 0;
                }else if(sum > mid){
                    isPossible = false;
                    sum = 0;
                    i--;
                }
            }

            if(isPossible){
                end = mid - 1;
            } else start++;
        }

        System.out.println(start);
    }
}