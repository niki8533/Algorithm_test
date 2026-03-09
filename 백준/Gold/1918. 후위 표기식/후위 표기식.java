import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		for(int i = 0 ; i < str.length() ; i++){
			char c = str.charAt(i);

			switch (c){
				case '+':
				case '-':
				case '*':
				case '/':
					while(!stack.isEmpty() && priority(stack.peek()) >= priority(c)){
						sb.append(stack.pop());
					}
					stack.push(c);
					break;

				case '(':
					stack.push(c);
					break;

				case ')':
					while(!stack.isEmpty() && stack.peek() != '('){
						sb.append(stack.pop());
					}
					stack.pop();
					break;

				default:
					sb.append(c);
					break;
			}
		}

		while(!stack.isEmpty()){
			sb.append(stack.pop());
		}

		System.out.println(sb);
	}

	public static int priority(char c){
		if(c == '(' || c == ')'){
			return 0;
		} else if(c == '+' || c == '-'){
			return 1;
		} else if(c == '*' || c == '/'){
			return 2;
		}

		return -1;
	}
}
