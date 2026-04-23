import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int cnt = 0;
        int answer = 0;
        for(int i = 0 ; i < str.length() - 1 ; i++){
            char c = str.charAt(i);
            char cp = str.charAt(i+1);

            if(c == '(' && cp == '('){
                cnt++;
            } else if(c == ')' && cp == ')'){
                answer += cnt;
            }
        }

        System.out.println(answer);
    }
}