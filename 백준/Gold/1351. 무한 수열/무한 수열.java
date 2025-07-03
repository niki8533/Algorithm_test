import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

//백준 - 무한 수열
public class Main {
    static Map<Long, Long> map = new HashMap<>();
    static int p, q;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Long n = Long.parseLong(st.nextToken());
        p = Integer.parseInt(st.nextToken());
        q = Integer.parseInt(st.nextToken());

        System.out.println(sequence(n));

    }

    public static Long sequence(long num) {
        if(num == 0) return 1L;
        if(map.containsKey(num)) return map.get(num);

        long a = (long)Math.floor(num/p);
        long b = (long)Math.floor(num/q);

        map.put(num, sequence(a)+sequence(b));
        return map.get(num);
    }
}
