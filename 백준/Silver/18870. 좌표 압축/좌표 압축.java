import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int[] sorting = new int[N];
        for(int i = 0 ; i < N ; i++){
            arr[i] = sorting[i] = Integer.parseInt(st.nextToken());
            
        }

        Arrays.sort(sorting);

        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 0;
        for(int value: sorting){
            if(!map.containsKey(value)){
                map.put(value, rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int key : arr){
            int ranking = map.get(key);
            sb.append(ranking + " ");
        }

        System.out.println(sb);
    }
}
