import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		HashMap<Integer, Integer> map = new HashMap<>();
		TreeSet<Problem> set = new TreeSet<>();
		StringBuilder sb = new StringBuilder();

		for(int i = 0 ; i < N ; i++){
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int P = Integer.parseInt(st.nextToken());
			int L = Integer.parseInt(st.nextToken());

			map.put(P, L);
			set.add(new Problem(P, L));
		}

		int M = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < M ; i++){
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String command = st.nextToken();

			switch (command){
				case "add":
					int P = Integer.parseInt(st.nextToken());
					int L = Integer.parseInt(st.nextToken());
					map.put(P, L);
					set.add(new Problem(P, L));
					break;
				case "solved":
					P = Integer.parseInt(st.nextToken());
					L = map.get(P);
					map.remove(P);
					set.remove(new Problem(P, L));
					break;
				case "recommend":
					int x = Integer.parseInt(st.nextToken());
					if (x == 1) {
						sb.append(set.last().P).append("\n");
					} else {
						sb.append(set.first().P).append("\n");
					}
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
		public int compareTo(Problem o){
			if(this.L == o.L){
				return this.P - o.P;
 			}

			return this.L - o.L;
		}
	}
}
