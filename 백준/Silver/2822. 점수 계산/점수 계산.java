import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < 8 ; i++){
            int score = Integer.parseInt(br.readLine());
            map.put(score, i+1);
            list.add(score);
        }

        Collections.sort(list, Collections.reverseOrder());
        int answer = 0;
        ArrayList<Integer> index = new ArrayList<>();

        for(int i = 0 ; i < 5 ; i++){
            answer = answer + list.get(i);
            index.add(map.get(list.get(i)));
        }

        Collections.sort(index);

        StringBuilder sb = new StringBuilder();
        sb.append(answer).append("\n");
        for(int i = 0 ; i < 4 ; i++){
            sb.append(index.get(i) + " ");
        }
        sb.append(index.get(4));

        System.out.println(sb);
    }
}
