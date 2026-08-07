import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int answer = 0;
        int length = str.length();
        for(int i = 0 ; i < length ; i++){
            char c = str.charAt(i);
            answer += (c - 48) * Math.pow(2, length - i - 1);
        }

        System.out.println(answer);
    }
}