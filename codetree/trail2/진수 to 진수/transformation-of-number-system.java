import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        String str = br.readLine();
        
        int length = str.length();
        int n = 0;
        for(int i = 0 ; i < length ; i++){
            char c = str.charAt(i);

            n += (c - 48) * Math.pow(a, length - i - 1);
        }
        
        StringBuilder sb = new StringBuilder();
        while(n < b){
            sb.append(n % b);
            System.out.println(sb);
            n /= b;
        }
        sb.append(n);

        System.out.println(sb);
    }
}