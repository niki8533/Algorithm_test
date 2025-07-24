import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//백준 - AC
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for(int test = 0 ; test < T ; test++){
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine());
            Deque<Integer> list = new ArrayDeque<>();

            String input = br.readLine();
            input = input.substring(1, input.length() - 1);
            if(!input.isEmpty()){
                String[] arr = input.split(",");
                for(String str : arr){
                    list.add(Integer.parseInt(str));
                }
            }

            Boolean isReverse = false;
            Boolean isError = false;
            for(int i = 0 ; i < p.length() ; i++){
                char c = p.charAt(i);
                if(c == 'R') {
                    isReverse = !isReverse;
                } else if(c == 'D'){
                    if(list.isEmpty()){
                        isError = true;
                        break;
                    } else {
                        if (isReverse) {
                            list.removeLast();
                        } else if (!isReverse) {
                            list.removeFirst();
                        }
                    }
                }
            }
            if(isError){
                sb.append("error").append("\n");
            } else {
                if (!list.isEmpty()) {
                    int size = list.size();
                    sb.append("[");
                    if (isReverse) {
                        for (int i = 0; i < size - 1; i++) {
                            sb.append(list.pollLast()).append(",");
                        }
                        sb.append(list.pollLast()).append("]\n");
                    } else if (!isReverse) {
                        for (int i = 0; i < size - 1; i++) {
                            sb.append(list.pollFirst()).append(",");
                        }
                        sb.append(list.pollFirst()).append("]\n");
                    }
                } else {
                    sb.append("[]").append("\n");
                }
            }
        }

        System.out.println(sb);
    }
}
