import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        HashSet<Integer> set = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            set.add(Integer.parseInt(st.nextToken()));
        }

        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < list.size() - 1 ; i++){
            sb.append(list.get(i) + " ");
        }
        sb.append(list.get(list.size() - 1));
        
        System.out.println(sb);
    }
}
