import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        int[][] eat = new int[D][3];
        for(int i = 0 ; i < D ; i++){
            st = new StringTokenizer(br.readLine());
            eat[i][0] = Integer.parseInt(st.nextToken());
            eat[i][1] = Integer.parseInt(st.nextToken());
            eat[1][2] = Integer.parseInt(st.nextToken());
        }

        int[][] sick = new int[S][2];
        for(int i = 0 ; i < S ; i++){
            st = new StringTokenizer(br.readLine());
            sick[i][0] = Integer.parseInt(st.nextToken());
            sick[i][1] = Integer.parseInt(st.nextToken());
        }

        int max = 0;
        for(int cheese = 1 ; cheese <= M ; cheese++){
            boolean possible = true;

            for(int i = 0 ; i < S ; i++){
                int sickPerson = sick[i][0];
                int sickTime = sick[i][1];
                boolean ate = false;

                for(int j = 0 ; j < D ; j++){
                    if(eat[j][0] == sickPerson && eat[j][1] == cheese && eat[j][2] < sickTime){
                        ate = true;
                        break;
                    }
                }

                if(!ate){
                    possible = false;
                    break;
                }
            }

            if(possible){
                Set<Integer> set = new HashSet<>();
                for(int i = 0 ; i < D ; i++){
                    if(eat[i][1] == cheese){
                        set.add(eat[i][0]);
                    }
                }

                max = Math.max(max, set.size());
            }
        }

        System.out.println(max);
    }
}