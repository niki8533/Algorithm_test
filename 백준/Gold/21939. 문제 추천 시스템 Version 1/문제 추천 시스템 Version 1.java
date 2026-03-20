import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		TreeSet<Problem> tree = new TreeSet<>();
		HashMap<Integer, Integer> map = new HashMap<>();

		for(int i = 0 ; i < N ; i++){
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int P = Integer.parseInt(st.nextToken());
			int L = Integer.parseInt(st.nextToken());

			map.put(P, L);
			tree.add(new Problem(P, L));
		}

		int M = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < M ; i++){
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String command = st.nextToken();

			int P = 0;
			int L = 0;
			switch (command){
				case "recommend":
					int x = Integer.parseInt(st.nextToken());

					if(x == 1){
						sb.append(tree.last().P + "\n");
					} else sb.append(tree.first().P + "\n");
					break;
				case "add":
					P = Integer.parseInt(st.nextToken());
					L = Integer.parseInt(st.nextToken());

					map.put(P, L);
					tree.add(new Problem(P, L));
					break;
				case "solved":
					P = Integer.parseInt(st.nextToken());
					L = map.get(P);

					map.remove(P);
					tree.remove(new Problem(P, L));
					break;
			}
		}

		System.out.println(sb);
	}

	public static class Problem implements Comparable<Problem>{
		int P;
		int L;

		public Problem(int P, int L){
			this.P = P;
			this.L = L;
		}

		@Override
		public int compareTo(Problem o) {
			if(this.L == o.L){
				return this.P - o.P;
			}

			return this.L - o.L;
		}

	}
}
