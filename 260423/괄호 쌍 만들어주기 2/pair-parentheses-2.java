import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int count = 0;
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < str.length() - 1 ; i++){
            char c = str.charAt(i);
            char cp = str.charAt(i+1);

            if(c == '(' && cp == '('){
                stack.push(c);
                stack.push(cp);
            }
            else if(c == ')' && cp == ')'){
                stack.push(c);
                stack.push(cp);
            }
        }

        System.out.println(stack.size() / 2);
    }
}