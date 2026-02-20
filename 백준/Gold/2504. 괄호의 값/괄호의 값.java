import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		int count = 1;
		int answer = 0;

		Stack<Character> stack = new Stack<>();

		for(int i = 0 ; i < str.length() ; i++){
			char c = str.charAt(i);

			if(c == '('){
				stack.push(c);
				count *= 2;
			}
			else if(c == '['){
				stack.push(c);
				count *= 3;
			}
			else if(c == ')'){
				if(stack.isEmpty() || stack.peek() != '('){
					answer = 0;
					break;
				} else if(str.charAt(i-1) == '('){
					answer = answer + count;
				}
				count /= 2;
				stack.pop();
			}
			else if(c == ']'){
				if(stack.isEmpty() || stack.peek() != '['){
					answer = 0;
					break;
				} else if(str.charAt(i-1) == '['){
					answer = answer + count;
				}
				count /= 3;
				stack.pop();
			}
		}

		if(!stack.isEmpty()){
			answer = 0;
		}

		System.out.println(answer);
	}
}
