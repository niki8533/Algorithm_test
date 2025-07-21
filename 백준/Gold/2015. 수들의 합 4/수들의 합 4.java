import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.StringTokenizer;

//백준 - 수들의 합4
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] sum = new int[N+1];
        long answer = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 1 ; i <= N ; i++) {
            int num = Integer.parseInt(st.nextToken());
            sum[i] = sum[i-1] + num;
            if(sum[i] == K){
                answer++;
            }
            answer += map.getOrDefault(sum[i] - K, 0);
            map.put(sum[i], map.getOrDefault(sum[i], 0) + 1);
        }


        System.out.println(answer);
    }
}
