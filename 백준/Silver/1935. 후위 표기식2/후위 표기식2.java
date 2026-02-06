import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		Stack<Double> stack = new Stack<>();

		String str = br.readLine();

		double[] arr = new double[N];
		for(int i = 0 ; i < N ; i++){
			arr[i] = Double.parseDouble(br.readLine());
		}

		double result = 0;
		for(int i = 0 ; i < str.length() ; i++){
			char c = str.charAt(i);

			if(c >= 'A' && c <= 'Z'){
				stack.push(arr[c - 'A']);
			}
			else {
				if(!stack.isEmpty()) {
					double first = stack.pop();
					double second = stack.pop();
					switch (c) {
						case '+':
							result = second + first;
							stack.push(result);
							break;
						case '-':
							result = second - first;
							stack.push(result);
							break;
						case '*':
							result = second * first;
							stack.push(result);
							break;
						case '/':
							result = second / first;
							stack.push(result);
							break;
					}
				}
			}
		}

		System.out.printf("%.2f", stack.pop());
	}
}
