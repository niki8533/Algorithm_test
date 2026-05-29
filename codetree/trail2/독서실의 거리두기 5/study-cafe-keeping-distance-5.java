import java.util.*;
import java.io.*;

public class Main {
    static int N = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        int max = 0;

        String str = br.readLine();
        int[] arr = new int[N];
        for(int i = 0 ; i < N ; i++){
            char c = str.charAt(i);
            arr[i] = c - 48;
        }

        for(int i = 0 ; i < N ; i++){
            int[] temp = new int[N];
            if(arr[i] == 1) continue;

            for(int j = 0 ; j < N ; j++){
                
                if(i == j){
                    temp[j] = 1;
                }
                else temp[j] = arr[j];
            }

            max = Math.max(max, distance(temp));
        }

        System.out.println(max);
    }

    public static int distance(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < N ; i++){
            if(arr[i] == 0) continue;

            for(int j = i + 1 ; j < N ; j++){
                if(arr[j] == 1){
                    min = Math.min(min, (j - i));
                    break;
                }
            }
 
        }

        return min;
    }
}