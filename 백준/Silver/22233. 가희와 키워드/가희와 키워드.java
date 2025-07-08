import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

//백준 - 가희와 키워드
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        HashSet<String> set = new HashSet<>();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i = 0 ; i < N ; i++){
            set.add(br.readLine());
        }

        for(int i = 0 ; i < M ; i++){
            String[] arr = br.readLine().split(",");

            for(String str : arr){
                if(set.contains(str)){
                    set.remove(str);
                }
            }

            sb.append(set.size()).append("\n");
        }

        System.out.println(sb);
    }
}
