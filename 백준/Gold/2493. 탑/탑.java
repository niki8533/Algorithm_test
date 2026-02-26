import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());

		Stack<int[]> stack = new Stack<>();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		sb.append(0 + " ");
		stack.push(new int[]{Integer.parseInt(st.nextToken()), 1});

		for(int i = 1 ; i < N ; i++){
			int t = Integer.parseInt(st.nextToken());

			while(!stack.isEmpty() && stack.peek()[0] < t){
				stack.pop();
			}

			if(stack.isEmpty()){
				sb.append("0 ");
			} else {
				sb.append(stack.peek()[1] + " ");
			}

			stack.push(new int[]{t, i+1});
		}

		System.out.println(sb);
	}
}