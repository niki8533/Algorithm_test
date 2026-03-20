import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());


		StringBuilder sb = new StringBuilder();

		for(int test_case = 0 ; test_case < T ; test_case++){
			int k = Integer.parseInt(br.readLine());

			TreeMap<Integer, Integer> map = new TreeMap<>();
			for(int i = 0 ; i < k ; i++){
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");

				String str = st.nextToken();
				int n = Integer.parseInt(st.nextToken());

				int key = 0;

				switch (str){
					case "I":
						map.put(n, map.getOrDefault(n, 0) + 1);
						break;
					case "D":
						if(map.isEmpty()){
							continue;
						}
						if(n == 1){
							key = map.lastKey();
						} else if(n == -1){
							key = map.firstKey();
						}

						map.put(key, map.get(key) - 1);

						if(map.get(key) == 0){
							map.remove(key);
						}
						break;
				}
			}

			if(map.isEmpty()){
				sb.append("EMPTY\n");
			} else {
				sb.append(map.lastKey() + " " + map.firstKey() + "\n");
			}
		}

		System.out.println(sb);
	}
}
