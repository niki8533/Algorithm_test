import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int max = 0;
        while(C > 0){
            for(int i = 0 ; i <= C/A ; i++){
                int sum = B*i;

                int temp = C - sum;
                if(temp % A == 0){
                    max = C;
                    System.out.println(max);
                    return;
                }
            }

            C--;
        }
    }
}