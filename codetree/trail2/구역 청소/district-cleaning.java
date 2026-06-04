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

        int max = Math.max(b, d);
        int min = Math.min(a, c);

        int clean = max - min;

        if(b < c){
            clean -= (c - b);
        } else if(d < a){
            clean -= (a - d);
        }
        
        System.out.println(clean);
    }
}