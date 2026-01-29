import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < num ; i++){
			String ps = br.readLine();

			Stack<Character> stack = new Stack<>();
			for(int j = 0 ; j < ps.length() ; j++) {
				char c = ps.charAt(j);
				if( c == '(' || stack.isEmpty())
					stack.add(c);
				else
					if(stack.peek() == '(')
						stack.pop();
			}

			if(stack.isEmpty())
				sb.append("YES\n");
			else
				sb.append("NO\n");
		}

		System.out.print(sb);
	}
}
