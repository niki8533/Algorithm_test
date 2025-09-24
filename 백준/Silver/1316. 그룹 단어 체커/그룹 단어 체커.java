import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int answer = 0;
        for(int i = 0 ; i < N ; i++){
            HashSet<Character> set = new HashSet<>();
            String str = br.readLine();

            set.add(str.charAt(0));
            boolean isGroup = true;
            for(int j = 1 ; j < str.length() ; j++) {
                char c = str.charAt(j);
                char prev = str.charAt(j-1);
                if (set.contains(c) && prev == c) {
                    set.add(c);
                } else if(!set.contains(c) && prev != c){
                    set.add(c);
                } else if(set.contains(c) && prev != c){
                    isGroup = false;
                    break;
                }
            }

            if(isGroup){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
