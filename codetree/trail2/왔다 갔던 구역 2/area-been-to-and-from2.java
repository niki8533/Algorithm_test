import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i < n ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            char d = st.nextToken().charAt(0);

            if(d == 'L'){
                for(int j = x - 1 ; j >= 0 ; j--){
                    map.put(j, map.getOrDefault(j, 0) + 1);
                }
            } else {
                for(int j = 0 ; j < x ; j++){
                    map.put(j, map.getOrDefault(j, 0) + 1);
                }
            }
        }

        int answer = 0;
        for(int key : map.keySet()){
            if(map.get(key) >= 2){
                answer++;
            }
        }

        System.out.println(answer);
    }
}