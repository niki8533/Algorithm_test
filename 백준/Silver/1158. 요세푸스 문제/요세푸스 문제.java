import java.util.*;
import java.io.*;
//백준 - 요세푸스 문제
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> answer = new LinkedList<>();
        for(int i = 0 ; i < n ; i++){
            q.offer(i+1);
        }

        sb.append("<");
        while(!q.isEmpty()){
            for(int i = 0 ; i < k - 1 ; i++){
                q.offer(q.poll());
            }
            answer.offer(q.poll());
        }

        while(!answer.isEmpty()){
            if(answer.size() == 1){
                sb.append(answer.poll()).append(">");
                break;
            }
            sb.append(answer.poll()).append(", ");
        }

        System.out.println(sb);
    }
}
