import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int min = Integer.MAX_VALUE;
        int max = 0;
        int[] arr = new int[101];
        for(int i = 0 ; i < N ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());

            for(int j = x1 ; j <= x2 ; j++){
                arr[j]++;
            }

            min = Math.min(min, x1);
            max = Math.max(max, x2);
        }

        boolean isOverlap = false;
        for(int i = min ; i <= max ; i++){
            if(arr[i] == (N - 1)){
                isOverlap = true;
                break;
            }
        }

        if(isOverlap){
            System.out.println("Yes");
        } else System.out.println("No");
    }
}