import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr1 = new int[3];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < 3 ; i++){
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        int[] arr2 = new int[3];
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < 3 ; i++){
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        for(int i = 1 ; i <= N ; i++){
            for(int j = 1 ; j <= N ; j++){
                for(int k = 1 ; k <= N ; k++){
                    if(canOpen(i, j, k, arr1, N) || canOpen(i, j, k, arr2, N)){
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }

    static boolean isClose(int a, int b, int n){
        int diff = Math.abs(a - b);
        return Math.min(diff, n - diff) <= 2;
    }

    static boolean canOpen(int i, int j, int k, int[] arr, int n){
        return isClose(i, arr[0], n) && isClose(j, arr[1], n) && isClose(k, arr[2], n);
    }
}