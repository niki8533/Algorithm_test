import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int temp = 1;
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		String str = br.readLine();
		for(int i = 0 ; i < str.length() ; i++){
			char c = str.charAt(i);

			if(c == '('){
				stack.push(c);
				temp = temp * 2;
			}

			if(c == '['){
				stack.push(c);
				temp = temp * 3;
			}

			if(c == ')'){
				if(stack.isEmpty() || stack.peek() != '('){
					answer = 0;
					break;
				}
				else if(str.charAt(i-1) == '('){
					answer = temp + answer;
				}
				temp = temp / 2;
				stack.pop();
			}
			else if(c == ']'){
				if(stack.isEmpty() || stack.peek() != '['){
					answer = 0;
					break;
				}
				else if(str.charAt(i-1) == '['){
					answer = temp + answer;
				}
				temp = temp / 3;
				stack.pop();
			}
		}

        if(!stack.isEmpty()){
			answer = 0;
		}
        
		System.out.println(answer);
	}
}