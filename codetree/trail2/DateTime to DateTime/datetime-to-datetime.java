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

        System.out.println(dateTime(a, b, c));
    }

    public static int dateTime(int a, int b, int c){
        if(a < 11 || b < 11 || c < 11){
            return -1;
        }

        int time = 0;
        time += (a - 11) * 24 * 60;
        time += (b - 11) * 60;
        time += (c - 11);

        return time;
    }
}