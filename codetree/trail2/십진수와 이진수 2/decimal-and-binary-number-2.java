import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int n = toDecimal(str) * 17;        

        StringBuilder sb = new StringBuilder();
        while(n > 1){
            sb.append(n % 2);
            n /= 2;
        }
        sb.append(n);
        System.out.println(sb.reverse());
    }

    static int toDecimal(String str){
        int n = 0;
        for(int i = 0 ; i < str.length() ; i++){
            char c = str.charAt(i);

            n += (c - 48) * Math.pow(2, (str.length() - i - 1));
        }
        return n;
    }
}