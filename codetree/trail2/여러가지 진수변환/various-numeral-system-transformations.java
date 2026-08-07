import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        Stack<Integer> stack = new Stack<>();
        while(n >= b){
            stack.push(n % b);
            n /= b;
        }

        stack.push(n);

        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}