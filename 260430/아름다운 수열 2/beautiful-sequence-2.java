import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] arr2 = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < M ; i++){
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr2);
        
        int count = 0;
        for(int i = 0 ; i < N - M + 1; i++){
            int[] temp = new int[M];
            int idx = 0;
            for(int j = i ; j < i + M ; j++){
                 temp[idx] = arr[j];
                 idx++;
            }

            Arrays.sort(temp);

            if(Arrays.equals(temp, arr2)){
                count++;
            }
        }

        System.out.println(count);
    }
}