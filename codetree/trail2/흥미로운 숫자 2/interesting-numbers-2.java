import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int count = 0;
        for(int i = x ; i <= y ; i++){
            int[] arr = new int[10];
            int perfect = 0;
            int temp = i;
            while(temp > 0){
                arr[temp % 10]++;
                perfect++;

                temp /= 10;
            }

            int oneCount = 0;
            int majorityCount = 0;
            for(int j = 0 ; j < 10 ; j++){
                if(arr[j] == perfect - 1){
                    majorityCount++;
                } else if(arr[j] == 1){
                    oneCount++;
                }
            }

            if(oneCount == 1 && majorityCount == 1){
                count++;
            }
        }

        System.out.println(count);
    }
}