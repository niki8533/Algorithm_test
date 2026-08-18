import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int index = 0;
        for(int i = 0 ; i < n ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            char d = st.nextToken().charAt(0);

            if(d == 'L'){
                for(int j = (index - x) ; j < index ; j++){
                    map.put(j, map.getOrDefault(j, 0) + 1);
                }
                index -= x;
            } else {
                for(int j = index ; j < (index + x) ; j++){
                    map.put(j, map.getOrDefault(j, 0) + 1);
                }
                index += x;
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