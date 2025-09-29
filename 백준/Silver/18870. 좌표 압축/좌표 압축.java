import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        int[] arrSort = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            arr[i] = arrSort[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arrSort);

        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 0;
        for(int i = 0 ; i < N ; i++){
            if(!map.containsKey(arrSort[i])){
                map.put(arrSort[i], rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < N ; i++){
            sb.append(map.get(arr[i]) + " ");
        }

        System.out.print(sb);
    }
}
