import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s;
		int B;
		char c;
		int answer = 0;
		int temp = 1;
		
		s = sc.next();
		B = sc.nextInt();
				
		for(int i = s.length() -1 ; i >= 0  ; i--) {
			
			c = s.charAt(i);
			if(c >= 'A' && c <= 'Z') {
				answer = answer + (c - 55) * temp;
			}
			else
				answer = answer + (c - 48) * temp;
			
			temp = temp * B;
		}
		
		System.out.println(answer);
		
	}
}
