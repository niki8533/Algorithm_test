import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < M ; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int temp = 0;
            if(a > b){
                temp = (b * 10) + a;
            } else temp = (a * 10) + b;

            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }

        int max = 0;
        for(int key : map.keySet()){
            max = Math.max(max, map.get(key));
        }

        System.out.println(max);
    }
}