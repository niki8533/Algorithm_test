import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

//백준 - 두 배열의 합
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[] b = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < m ; i++){
            b[i] = Integer.parseInt(st.nextToken());
        }

        Map<Integer, Long> map = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            int sum = 0;
            for(int j = i ; j < n ; j++) {
                sum += a[j];
                map.put(sum, map.getOrDefault(sum, 0L) + 1);
            }
        }

        long answer = 0;
        for(int i = 0 ; i < m ; i++){
            int sum = 0;
            for(int j = i ; j < m ; j++) {
                sum += b[j];
                int temp = T - sum;
                if(map.containsKey(temp)){
                    answer += map.get(temp);
                }
            }
        }

        System.out.println(answer);
    }
}