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

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < N - 1 ; i++){
            for(int j = i+1 ; j < N ; j++){
                if((arr[i] + arr[j]) % 2 == 0){
                    map.put(arr[i] + arr[j], map.getOrDefault(arr[i]+arr[j], 0) + 1);
                }
            }
        }

        int max = 0;
        for(int key : map.keySet()){
            int value = map.get(key);
            max = Math.max(max, value);
        }
        System.out.println(max);
    }
}