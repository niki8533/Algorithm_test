import java.util.*;
import java.io.*;

public class Main {
	static List<int[]> 	list = new ArrayList<>();
	static boolean[] check;
	static Set<String> set;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		Stack<Integer> stack = new Stack<>();

		for(int i = 0 ; i < str.length() ; i++){
			char c = str.charAt(i);
			if(c == '('){
				stack.push(i);
			} else if(c == ')'){
				list.add(new int[]{stack.pop(), i});
			}
		}

		check = new boolean[str.length()];
		set = new TreeSet<>();
		comb(0, str.toCharArray());

		for(String s : set){
			System.out.println(s);
		}
	}

	static void comb(int depth, char[] chr){
		if(depth == list.size()){
			boolean f = false;
			StringBuilder sb = new StringBuilder();
			for(int i = 0 ; i < chr.length ; i++){
				if(!check[i]){
					sb.append(chr[i]);
				}
				else {
					f = true;
				}
			}

			if(f){
				set.add(sb.toString());
			}

			return;
		}

		int[] bracket = list.get(depth);
		comb(depth + 1, chr);
		check[bracket[0]] = true;
		check[bracket[1]] = true;

		comb(depth + 1, chr);
		check[bracket[0]] = false;
		check[bracket[1]] = false;
	}
}
