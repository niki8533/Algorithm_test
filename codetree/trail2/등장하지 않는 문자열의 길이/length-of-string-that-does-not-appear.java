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
            HashSet<String> set = new HashSet<>();
            for(int j = 0 ; j <= N - i ; j++){

                String compare = "";
                for(int k = j ; k < j + i ; k++){
                    compare += arr[k];
                }
                set.add(compare);
                count++;
            }

            if(count == set.size()){
                min = Math.min(min, i);
            }
        }

        System.out.println(min);
    }
}