import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");

        char[] arr = new char[N];
        for(int i = 0 ; i < N  ; i++){
            arr[i] = str[i].charAt(0);
        }

        int count = 0;
        for(int i = 0 ; i < N - 1 ; i++){
            for(int j = i ; j < N - 1 ; j++){
                if(arr[j] > arr[j+1]){
                    char temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}