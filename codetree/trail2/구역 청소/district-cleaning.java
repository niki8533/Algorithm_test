import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int clean = (b - a) + (d - c);

        if(a <= c && c <= b){
            clean -= (c - b);
        } else if(a <= d && d <= b){
            clean -= (d - a);
        } else if(c <= a && a <= d){
            clean -= (d - a);
        } else if(c <= b && b <= d){
            clean -= (b - c);
        }

        System.out.println(clean);
    }
}