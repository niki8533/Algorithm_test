import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

//백준 - 친구 네트워크
public class Main {
    static int[] parent;
    static int[] size;
    static int index;

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int Test_Case = Integer.parseInt(br.readLine());

        for(int T = 0 ; T < Test_Case ; T++){
            int F = Integer.parseInt(br.readLine());

            Map<String, Integer> map = new HashMap<>();
            parent = new int[F * 2];
            size = new int[F * 2];
            index = 0;

            for(int i = 0 ; i < F ; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                String name1 = st.nextToken();
                String name2 = st.nextToken();

                if(!map.containsKey(name1)){
                    map.put(name1, index);
                    parent[index] = index;
                    size[index] = 1;
                    index++;
                }

                if(!map.containsKey(name2)){
                    map.put(name2, index);
                    parent[index] = index;
                    size[index] = 1;
                    index++;
                }

                int result = union(map.get(name1), map.get(name2));
                System.out.println(result);
            }
        }
    }

    static int find(int x){
        if(parent[x] != x){
            parent[x] = find(parent[x]);
        }

        return parent[x];
    }

    static int union(int x, int y){
        int rootX = find(x);
        int rootY = find(y);

        if(rootX != rootY) {
            parent[rootY] = rootX;
            size[rootX] += size[rootY];
        }

        return size[rootX];
    }
}
