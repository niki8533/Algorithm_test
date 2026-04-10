import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int[] cnt = new int[N+1];
		for(int i = 0 ; i < N-1 ; i++){
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			cnt[a]++;
			cnt[b]++;
		}

		int q = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < q ; i++){
			st = new StringTokenizer(br.readLine());
			int t = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());

			if(t == 1){
				if(cnt[k] == 1){
					sb.append("no\n");
				} else {
					sb.append("yes\n");
				}
			} else sb.append("yes\n");
		}

		System.out.println(sb);
	}
}
