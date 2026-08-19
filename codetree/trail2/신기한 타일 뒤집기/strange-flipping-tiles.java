import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[200000];
        int offset = 100000;
        int index = 0;
        for(int i = 0 ; i < n ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            char d = st.nextToken().charAt(0);

            if(d == 'L'){
                for(int j = (index - x) + 1 ; j <= index ; j++){
                    arr[j + offset] = 1;
                }
                index = index - x + 1;
            } else {
                for(int j = index ; j < (index + x) ; j++){
                    arr[j + offset] = 2;
                }
                index = index + x - 1;
            }
        }

        int white = 0;
        int black = 0;
        for(int i = 0 ; i < 200000 ; i++){
            if(arr[i] == 0) continue;

            if(arr[i] == 1){
                white++;
            }
            else if(arr[i] == 2){
                black++;
            }
        }

        System.out.println(white + " " + black);
    }
}