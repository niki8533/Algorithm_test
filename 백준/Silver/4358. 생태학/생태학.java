import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		HashMap<String, Integer> map = new HashMap<>();
		TreeSet<String> set = new TreeSet<>();

		int count = 0;
		String s;
		while((s = br.readLine()) != null){
			count++;
			map.put(s, map.getOrDefault(s, 0) + 1);
			set.add(s);
		}

		for(String tree : set){
			String percent = String.format("%.4f", ((double)map.get(tree) / (double)count) * 100);
			sb.append(tree + " " + percent).append("\n");
		}

		System.out.println(sb);
	}
}
