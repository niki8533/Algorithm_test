import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < N ; i++){
            arr[i] *= 2;
            for(int j = 0 ; j < N ; j++){
                int[] temp = new int[N-1];
                int index = 0;
                for(int k = 0 ; k < N ; k++){
                    if(k == j){
                        continue;
                    }

                    temp[index++] = arr[k];
                }

                int sum = 0;
                for(int k = 0 ; k < N - 2 ; k++){
                    sum += Math.abs(temp[k] - temp[k + 1]);
                }
                min = Math.min(min, sum);
            }

            arr[i] /= 2;
        }

        System.out.println(min);
    }
}