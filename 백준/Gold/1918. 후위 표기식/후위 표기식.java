import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();

		for(int i = 0 ; i < str.length() ; i++){
			char c = str.charAt(i);

			switch (c) {
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
			}
		}

		while(!stack.isEmpty()){
			sb.append(stack.pop());
		}

		System.out.println(sb);
	}

	public static int priority(char operator){
		if(operator == ')' || operator == '('){
			return 0;
		} else if(operator == '*' || operator == '/'){
			return 2;
		} else if(operator == '+' || operator == '-'){
			return 1;
		}

		return -1;
	}
}
