import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		Deque<int[]> dq = new ArrayDeque<>();
		int[] arr = new int[N];

		for(int i = 0 ; i < N ; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for(int i = 1 ; i < N ; i++){
			dq.add(new int[]{i + 1, arr[i]});
		}

		StringBuilder sb = new StringBuilder();

		int move = arr[0];
		sb.append("1 ");

		while(!dq.isEmpty()){
			if(move > 0){
				for(int i = 0 ; i < move - 1 ; i++){
					dq.add(dq.poll());
				}

				int[] balloon = dq.poll();
				move = balloon[1];
				sb.append(balloon[0] + " ");
			}
			else {
				for(int i = 0 ; i < -move - 1 ; i++){
					dq.addFirst(dq.pollLast());
				}

				int[] balloon = dq.pollLast();
				move = balloon[1];
				sb.append(balloon[0] + " ");
			}
		}

		System.out.println(sb);
	}
}
