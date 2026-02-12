import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		Stack<Integer> stack = new Stack<>();

		int index = n;
		int start = 0;
		while(index --> 0){
			int num = Integer.parseInt(br.readLine());

			if(start < num){
				for(int i = start+1 ; i <= num ; i++){
					stack.push(i);
					sb.append("+\n");
				}
				start = num;
			}
			else if(stack.peek() != num){
				System.out.println("NO");
				return;
			}

			stack.pop();
			sb.append("-\n");
		}

		System.out.println(sb);
	}
}
