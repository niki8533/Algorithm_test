import java.util.*;
import java.io.*;

public class Main {
	static int K;
	static List<ArrayList<Integer>> list;
	static int[] arr;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		K = Integer.parseInt(br.readLine());
		arr = new int[(int)Math.pow(2, K) - 1];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}

		list = new ArrayList<>();

		for(int i = 0 ; i < K ; i++) {
			list.add(new ArrayList<>());
		}

		search(0, arr.length - 1, 0);

		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < K ; i++){
			for(int j : list.get(i)){
				sb.append(j).append(" ");
			}
			sb.append("\n");
		}

		System.out.println(sb);
	}

	static void search(int start, int end, int depth){
		if(depth == K){
			return;
		}

		int mid = (start + end) / 2;

		list.get(depth).add(arr[mid]);
		search(start, mid - 1, depth + 1);
		search(mid + 1, end, depth + 1);
	}
}
