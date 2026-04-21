import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        
        int[] arr = new int[a.length()];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = a.charAt(arr.length - i - 1) - 48;
        }

        int max = 0;
        int temp = 0;
        for(int i = 0 ; i < 4 ; i++){
            if(arr[i] == 0){
                temp = 1;
            } else {
                temp = 0;
            }

            int plus = 0;
            for(int j = 0 ; j < i ; j++){
                if(arr[j] == 1){
                    plus += Math.pow(2, j);
                }
            }
            if(temp == 1){
                plus += Math.pow(2, i);
            }
            for(int k = i + 1 ; k < arr.length ; k++){
                if(arr[k] == 1){
                    plus += Math.pow(2, k);
                }
            }

            max = Math.max(max, plus);
        }

        System.out.println(max);
    }
}