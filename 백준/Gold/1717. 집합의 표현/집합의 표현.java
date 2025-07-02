import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 - 집합의 표현
public class Main {
    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        parent = new int[n + 1];
        for(int i = 1 ; i <= n ; i++){
            parent[i] = i;
        }

        for(int i = 0 ; i < m ; i++){
            st = new StringTokenizer(br.readLine());

            int command = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(command == 0){
                union(a, b);
            } else if(command == 1){
                if(isSame(a, b) == true)
                    sb.append("YES").append("\n");
                else
                    sb.append("NO").append("\n");
            }
        }

        System.out.println(sb);

    }

    static int find(int x){
        if(parent[x] != x){
            parent[x] = find(parent[x]);
        }

        return parent[x];
    }

    static void union(int x, int y){
        int rootX = find(x);
        int rootY = find(y);

        if(rootX != rootY){
            parent[rootY] = rootX;
        }
    }

    static boolean isSame(int x, int y){
        return find(x) == find(y);
    }

}
