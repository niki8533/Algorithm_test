import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] plus = new int[N - 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N - 1 ; i++){
            plus[i] = Integer.parseInt(st.nextToken());
        }

        
        for(int i = 1 ; i <= N ; i++){
            List<Integer> list = new ArrayList<>();

            list.add(i);
            for(int j = 0 ; j < N - 1 ; j++){
                int next = Math.abs(list.get(j) - plus[j]);
                if(list.contains(next) || next == 0){
                    break;
                }

                list.add(next);
            }

            if(list.size() == N){
                StringBuilder sb = new StringBuilder();
                for(int j = 0 ; j < N ; j++){
                    sb.append(list.get(j) + " ");
                }
                System.out.println(sb);
                return;
            }
        }
    }
}