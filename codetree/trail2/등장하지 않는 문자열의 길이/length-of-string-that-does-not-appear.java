import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String str = br.readLine();
        char[] arr = new char[N];
        for(int i = 0 ; i < N ; i++){
            arr[i] = str.charAt(i);
        }

        int min = Integer.MAX_VALUE;
        for(int i = 1 ; i < N ; i++){
            int count = 0;
            for(int j = 0 ; j <= N - i ; j++){
                String temp = "";
                for(int k = 0 ; k < i ; k++){
                    temp += arr[k];
                }

                String compare = "";
                for(int k = j ; k < j + i ; k++){
                    compare += arr[k];
                }
                
                if(compare.equals(temp)){
                    count++;
                }
            }

            if(count == 1){
                min = Math.min(min, i);
            }
        }

        System.out.println(min);
    }
}