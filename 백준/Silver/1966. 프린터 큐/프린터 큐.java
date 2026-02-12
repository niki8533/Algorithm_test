import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		
		int test_case = sc.nextInt();
		
		
		for(int t = 0 ; t < test_case ; t++) {
			
			int N = sc.nextInt();
			int M = sc.nextInt();
			Queue<int[]> q = new LinkedList<int[]>();
			
			for(int i = 0 ; i < N ; i++) {
				q.offer(new int[] {i, sc.nextInt()});
			}
			
			int count = 0;
			
			while(!q.isEmpty()) {
				int[] front = q.poll();
				boolean isMax = true;
				
				for(int i = 0 ; i < q.size(); i++) {
					if(front[1] <  ((LinkedList<int[]>) q).get(i)[1]) {
						q.offer(front);
						for(int j = 0 ; j < i ; j++) {
							q.offer(q.poll());
						}
						isMax = false;
						break;
					}
				}
				if(isMax == false) {
					continue;
				}
				
				count++;
				if(front[0] == M) {
					break;
				}
			}
			sb.append(count).append('\n');
		}
		
		System.out.println(sb);
	}
}
