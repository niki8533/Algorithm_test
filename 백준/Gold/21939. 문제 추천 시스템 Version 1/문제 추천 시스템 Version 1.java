import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeSet;

//백준 - 문제 추천 시스템 Version1
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Integer> map = new HashMap<>();
        TreeSet<Problem> set = new TreeSet<>();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            set.add(new Problem(p, l));
            map.put(p, l);
        }

        int M = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < M ; i++){
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            switch (command){
                case "recommend":
                    int x = Integer.parseInt(st.nextToken());
                    if(x == 1){
                        sb.append(set.last().num).append("\n");
                    } else {
                        sb.append(set.first().num).append("\n");
                    }
                    break;
                case "add":
                    int p = Integer.parseInt(st.nextToken());
                    int l = Integer.parseInt(st.nextToken());
                    set.add(new Problem(p, l));
                    map.put(p, l);
                    break;
                case "solved":
                    p = Integer.parseInt(st.nextToken());
                    l = map.get(p);
                    set.remove(new Problem(p, l));
                    map.remove(p);
                    break;
            }
        }

        System.out.println(sb);
    }

    public static class Problem implements Comparable<Problem>{
        int num;
        int level;

        public Problem(int num, int level){
            this.num = num;
            this.level = level;
        }

        @Override
        public int compareTo(Problem o){
            if(this.level == o.level){
                return this.num - o.num;
            }
            return this.level - o.level;
        }
    }
}
