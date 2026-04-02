import java.util.*;
import java.io.*;

public class Main {
	static boolean[] visited;
	static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
	static int[] parent;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());

		visited = new boolean[N+1];
		parent = new int[N+1];

		for(int i = 0 ; i < N+1 ; i++){
			list.add(new ArrayList<>());
		}

		for(int i = 0 ; i < N - 1 ; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			list.get(x).add(y);
			list.get(y).add(x);
		}

		dfs(1);

		for(int i = 2 ; i < parent.length ; i++){
			sb.append(parent[i] + "\n");
		}

		System.out.println(sb);
	}

	public static void dfs(int a){
		visited[a] = true;

		for(int i : list.get(a)){
			if(!visited[i]){
				dfs(i);
				parent[i] = a;
			}
		}
	}
}
