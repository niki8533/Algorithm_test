import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        String str = br.readLine();
        for(int i = 0 ; i < N ; i++){
            char c = str.charAt(i);
            arr[i] = c - 48;
        }

        int maxmin = Integer.MAX_VALUE;
        int max = 0;
        for(int i = 0 ; i < N ; i++){
            if(arr[i] == 1){
                continue;
            }

            int[] temp = new int[N];
            for(int j = 0 ; j < N ; j++){
                if(i == j){
                    temp[j] = 1;
                } else temp[j] = arr[j];
            }

            max = Math.max(max, distance(temp));
        }
        

        System.out.println(max);
    }

    public static int distance(int[] arr){
        int min = Integer.MAX_VALUE;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 0) continue;

            for(int j = i + 1 ; j < arr.length ; j++){
                if(arr[j] == 1){
                    min = Math.min(min, (j - i));
                    break;
                }
            }
        }

        return min;
    }
}