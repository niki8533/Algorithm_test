import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < N ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            String command = st.nextToken();
            switch(command){
                case "push":
                    int temp = Integer.parseInt(st.nextToken());
                    stack.push(temp);
                    break;
                case "pop":
                    if(stack.isEmpty())
                        sb.append(-1 + "\n");
                    else sb.append(stack.pop() + "\n");
                    break;
                case "size":
                    sb.append(stack.size() + "\n");
                    break;
                case "empty":
                    if(stack.isEmpty())
                        sb.append(1 + "\n");
                    else sb.append(0 + "\n");
                    break;
                case "top":
                    if(stack.isEmpty())
                        sb.append(-1 + "\n");
                    else sb.append(stack.peek() + "\n");
                    break;
            }
        }

        System.out.println(sb);
    }
}
