import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[] arr = new int[N];
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < N ; i++){

            Stack<Integer> stack = new Stack<>();
            int distance = 0;
            int index = i;

            while(stack.size() < N){
                distance += arr[index]*stack.size();
                stack.push(arr[index]);
                index++;
                if(index == N){
                    index = 0;
                }
            }

            min = Math.min(min, distance);
        }

        System.out.println(min);
    }
}