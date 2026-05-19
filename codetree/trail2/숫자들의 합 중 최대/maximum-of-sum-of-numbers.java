import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int max = 0;
        for(int i = x ; i <= y ; i++){
            int temp = i;
            int sum = 0;
            while(temp >= 10){
                sum += (temp % 10);
                temp = temp / 10;
            }
            sum += temp;

            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}