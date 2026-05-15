import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int answer = -1;
        for(int i = 0 ; i < N - 1 ; i++){
            boolean boom = false;
            int index = 0;
            for(int j = i+1 ; j < N ; j++){
                if(arr[i] == arr[j]){
                    boom = true;
                    index = j;
                    break;
                }
            }
            

            if(boom && (index-i) <= K){
                answer = Math.max(answer, arr[i]);
            }
        }

        System.out.println(answer);
    }
}