import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 0 ; test_case < T ; test_case++) {
			int C = sc.nextInt();
			
			int q = C / 25;
			C = C % 25;
			
			int d = C / 10;
			C = C % 10;
			
			int n = C / 5;
			int p = C % 5;
			
			System.out.println(q + " " + d + " " + n + " " + p);
		}
	}
}
