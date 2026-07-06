import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] pigeons = new int[11];
        int[] count = new int[11];

        int answer = 0;
        for(int i = 0 ; i < N ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int pigeon = Integer.parseInt(st.nextToken());
            int direction = Integer.parseInt(st.nextToken());

            if(pigeons[pigeon] != direction && count[pigeon] >= 1){
                answer++;
            }

            pigeons[pigeon] = direction;
            count[pigeon]++;
        }

        System.out.println(answer);
    }
}