import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());


		StringBuilder sb = new StringBuilder();

		for(int i = 0 ; i < T ; i++){
			int K = Integer.parseInt(br.readLine());

			TreeMap<Integer, Integer> map = new TreeMap<>();

			for(int j = 0 ; j < K ; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				String cal = st.nextToken();
				int num = Integer.parseInt(st.nextToken());

				int key = 0;

				if(cal.equals("I")){
					map.put(num, map.getOrDefault(num, 0) + 1);
				} else if(cal.equals("D")){
					if(map.size() == 0) continue;
					if(num == 1){
						key = map.lastKey();
					} else if(num == -1){
						key = map.firstKey();
					}

					map.put(key, map.get(key) - 1);

					if(map.get(key) == 0){
						map.remove(key);
					}
				}
			}



			if(map.size() == 0){
				sb.append("EMPTY\n");
			} else {
				sb.append(map.lastKey() + " " + map.firstKey() + "\n");
			}
		}

		System.out.println(sb);
	}
}
