import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());



		HashSet<String> set = new HashSet<>();
		for(int i = 0 ; i < N ; i++){
			set.add(br.readLine());
		}

		Stack<String> stack = new Stack<>();
		for(int i = 0 ; i < M ; i++){
			stack.push(br.readLine());
		}

		int answer = 0;
		while(!stack.isEmpty()){
			if(set.contains(stack.pop())){
				answer++;
			}
		}

		System.out.println(answer);
	}
}
