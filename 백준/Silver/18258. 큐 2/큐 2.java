import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		Deque<Integer> q = new LinkedList<>();
		
		StringTokenizer st;
		
		for(int i = 0 ; i < N ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String s = st.nextToken();
			
			switch(s) {
			case "push":
				q.offer(Integer.parseInt(st.nextToken()));
				break;
				
			case "pop":
				Integer poll = q.poll();
				if(poll == null)
					sb.append(-1).append('\n');
				else
					sb.append(poll).append('\n');
				break;
				
			case "size":
				sb.append(q.size()).append('\n');
				break;
				
			case "empty":
				if(q.isEmpty())
					sb.append(1).append('\n');
				else
					sb.append(0).append('\n');
				break;
				
			case "front":
				Integer front = q.peek();
				if(front == null)
					sb.append(-1).append('\n');
				else
					sb.append(front).append('\n');
				break;
				
			case "back":
				Integer back = q.peekLast();
				if(back == null)
					sb.append(-1).append('\n');
				else
					sb.append(back).append('\n');
				break;
			}
		}
		
		System.out.println(sb);
	}
}
