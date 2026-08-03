import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int answer = dateTime(a, b, c);
        if(answer < 0){
            System.out.println(-1);
        } else System.out.println(answer);
    }

    public static int dateTime(int a, int b, int c){
        int time = 0;
        time += (a - 11) * 24 * 60;
        time += (b - 11) * 60;
        time += (c - 11);

        return time;
    }
}