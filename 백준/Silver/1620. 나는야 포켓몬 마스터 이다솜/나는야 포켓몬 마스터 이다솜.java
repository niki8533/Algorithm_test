import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		HashMap<String, Integer> map = new HashMap<>();
		HashMap<Integer, String> map2 = new HashMap<>();
		StringBuilder sb = new StringBuilder();

		for(int i = 0 ; i < N ;i++){
			String pocketmon = br.readLine();
			map.put(pocketmon, i+1);
			map2.put(i+1, pocketmon);
		}


		for(int i = 0 ; i < M ; i++){
			String str = br.readLine();

			if(49 <= str.charAt(0) && str.charAt(0) <= 57) {
				sb.append(map2.get(Integer.parseInt(str)) + "\n");
			} else {
				sb.append(map.get(str) + "\n");
			}
		}

		System.out.println(sb);
	}
}
