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
        int d = Integer.parseInt(st.nextToken());

        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int answer = 0;
        int front = 0;
        int back = 0;

        for(int i = 0 ; i < (a-1) ; i++){
            front += month[i];
        }
        front += b;

        for(int i = 0 ; i < (c-1) ; i++){
            back += month[i];
        }
        back += d;

        answer = back - front + 1;
        System.out.println(answer);
    }
}