import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        System.out.println(multiple(n, m));
    }

    public static int multiple(int n, int m){
        int temp = 1;
        int answer = 0;
        while(true){
            if((m * temp) % n == 0){
                answer = m*temp;
                break;
            
            }

            temp++;
        }

        return answer;
    }
}