import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String N = br.readLine();

        int[] arr = new int[N.length()];
        for(int i = 0 ; i < N.length() ; i++){
            arr[i] = Integer.parseInt(String.valueOf(N.charAt(i)));
        }

        Arrays.sort(arr);

        int sum = 0;
        boolean isZero = false;
        for(int i = arr.length - 1 ; i >= 0 ; i--){
            sum = sum + arr[i];
            if(arr[i] == 0){
                isZero = true;
            }
            sb.append(arr[i]);
        }

        if(sum % 3 == 0 && isZero) {
            System.out.println(sb);
        } else {
            System.out.println(-1);
        }
    }
}
