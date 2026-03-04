import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		Stack<Character> stack = new Stack<>();

		int answer = 0;
		int temp = 1;
		for(int i = 0 ; i < str.length() ; i++){
			char c = str.charAt(i);
			
			switch(c){
				case '(':
					stack.push(c);
					temp = temp * 2;
					break;
				case '[':
					stack.push(c);
					temp = temp * 3;
					break;
				case ')':
					if(stack.isEmpty() || stack.peek() != '('){
                        System.out.println(0);
						return;
					} else if(str.charAt(i-1) == '('){
						answer = answer + temp;
					}
					stack.pop();
					temp = temp / 2;
					break;
				case ']':
					if(stack.isEmpty() || stack.peek() != '['){
                        System.out.println(0);
						return;
					} else if(str.charAt(i-1) == '['){
						answer = answer + temp;
					}
					stack.pop();
					temp = temp / 3;
					break;
			}
		}

		if(!stack.isEmpty()){
			answer = 0;
		}

		System.out.println(answer);
	}
}
