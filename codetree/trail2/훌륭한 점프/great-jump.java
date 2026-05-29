import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static int K;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        int max = 0;
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, arr[i]);
        }

        int minmax = Integer.MAX_VALUE;
        for(int i = Math.max(arr[0], arr[N-1]) ; i <= max ; i++){
            if(isPossible(i, arr)){
                minmax = Math.min(minmax, i);
            }
        }

        System.out.println(minmax);

    }

    public static boolean isPossible(int maxVal, int[] arr){
        int lastIndex = 0;
        for(int i = 1 ; i < N ; i++){
            if(arr[i] <= maxVal){
                if(i - lastIndex > K){
                    return false;
                }

                lastIndex++;
            }
        }

        return true;
    }
}