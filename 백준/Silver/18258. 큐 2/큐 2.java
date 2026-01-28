import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		Deque<Integer> q = new LinkedList<>();

		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		for(int i = 0; i < num; i++){
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String command = st.nextToken();

			switch (command){
				case "push":
					q.offer(Integer.parseInt(st.nextToken()));
					break;

				case "pop":
					if(q.isEmpty())
						sb.append(-1).append("\n");
					else
						sb.append(q.poll()).append("\n");
					break;

				case "size":
					sb.append(q.size()).append("\n");
					break;

				case "empty":
					if(q.isEmpty())
						sb.append(1).append("\n");
					else
						sb.append(0).append("\n");
					break;

				case "front":
					if(q.isEmpty())
						sb.append(-1).append("\n");
					else
						sb.append(q.peek()).append("\n");
					break;

				case "back":
					if(q.isEmpty())
						sb.append(-1).append("\n");
					else
						sb.append(q.peekLast()).append("\n");
					break;
			}
		}
		
		System.out.print(sb);
	}
}
