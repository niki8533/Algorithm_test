import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();

        int max = 0;
        for(int i = 0 ; i < a.length() ; i++){
            StringBuilder sb = new StringBuilder(a);

            if(sb.charAt(i) == '0'){
                sb.setCharAt(i, '1');
            } else {
                sb.setCharAt(i, '0');
            }

            int decimal = Integer.parseInt(sb.toString(), 2);
            max = Math.max(max, decimal);
        }

        System.out.println(max);
    }
}