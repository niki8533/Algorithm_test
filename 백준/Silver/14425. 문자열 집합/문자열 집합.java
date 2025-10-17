import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int count = 0;
		HashMap<String, Integer> word = new HashMap<>();
		
		for(int i = 0 ; i < N ; i++) {
			word.put(sc.next(), 1);
		}
		
		for(int i = 0 ; i < M ; i++) {
			if(word.get(sc.next()) != null)
				count++;
		}
		
		System.out.println(count);
	}
}
