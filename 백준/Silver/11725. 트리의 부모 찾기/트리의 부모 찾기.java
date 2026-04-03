import java.util.*;
import java.io.*;

public class Main {
	static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
	static boolean[] visited;
	static int[] parent;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		visited = new boolean[N];
		parent = new int[N];

		for(int i = 0 ; i < N+1 ; i++){
			list.add(new ArrayList<>());
		}

		for(int i = 0 ; i < N - 1 ; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()) - 1;
			int y = Integer.parseInt(st.nextToken()) - 1;

			list.get(x).add(y);
			list.get(y).add(x);
		}

		dfs(0);

		for(int i = 1 ; i < parent.length ; i++){
			sb.append(parent[i] + "\n");
		}

		System.out.println(sb);
	}

	public static void dfs(int depth){
		visited[depth] = true;

		for(int i : list.get(depth)){
			if(!visited[i]){
				dfs(i);
				parent[i] = depth+1;
			}
		}
	}
}
