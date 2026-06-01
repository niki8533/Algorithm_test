import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < N - 1 ; i++){
            boolean boom = false;
            int index = 0;
            for(int j = i + 1 ; j < N ; j++){
                if(arr[i] == arr[j]){
                    boom = true;
                    index = j;
                    break;
                }
            }

            if(boom && (index-i) <= K){
                map.put(arr[i] , map.getOrDefault(arr[i], 1) + 1);
            }
        }

        if(map.size() == 0){
            System.out.print(0);
            return;
        }

        int[][] answer = new int[map.size()][2];
        int cnt = 0;
        for(int i : map.keySet()){
            answer[cnt][0] = i;
            answer[cnt++][1] = map.get(i);
        }

        Arrays.sort(answer, (o1, o2) -> {
            if(o1[1] == o2[1]){
                return o2[0] - o1[0]; 
            }

            return o2[1] - o1[1];
        });

        System.out.print(answer[0][0]);
    }
}