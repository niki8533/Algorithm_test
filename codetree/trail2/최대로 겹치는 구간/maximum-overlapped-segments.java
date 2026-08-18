import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.\
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());

            for(int j = x1 ; j <= x2 ; j++){
                map.put(j, map.getOrDefault(j, 0) + 1);
            }
        }

        int max = 0;
        for(int key : map.keySet()){
            max = Math.max(max, map.get(key));
        }

        System.out.println(max);
    }
}