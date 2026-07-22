import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        printNum(n);
    }

    static void printNum(int n){
        int temp = 1;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print(temp + " ");
                if(temp == 9){
                    temp = 1;
                } else temp++;
            }

            System.out.println();
        }
    }
}