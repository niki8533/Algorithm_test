import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int way1 = 0;
        int way2 = 0;
        int way3 = 0;

        way1 = Math.abs(A - B);
        way2 = Math.abs(A - x) + Math.abs(B - y);
        way3 = Math.abs(A - y) + Math.abs(B - x);

        int min = Math.min(way1, Math.min(way2, way3));
        System.out.println(min); 
    }
}