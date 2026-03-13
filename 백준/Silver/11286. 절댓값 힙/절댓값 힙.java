import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
			int abs1 = Math.abs(o1);
			int abs2 = Math.abs(o2);
			
			if(abs1 > abs2)
				return abs1 - abs2;
			else if(abs1 == abs2)
				return o1 - o2;
			else
				return -1;
		});
		
		int N = sc.nextInt();
		
		for(int i = 0 ; i < N ; i++) {
			int x = sc.nextInt();
			
			if(x == 0)
				if(pq.isEmpty())
					sb.append(0).append('\n');
				else
					sb.append(pq.poll()).append('\n');
			else
				pq.add(x);
		}
		
		System.out.println(sb);
	}
}
