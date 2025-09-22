import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> crane = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            crane.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());
        ArrayList<Integer> box = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < M ; i++){
            box.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(crane, Collections.reverseOrder());
        Collections.sort(box, Collections.reverseOrder());
        if(crane.get(0) < box.get(0)){
            System.out.println(-1);
            return;
        }

        int time = 0;
        while(!box.isEmpty()){
            int temp = 0;
            for(int i = 0 ; i < N ; i++){
                while(temp < box.size()) {
                    if (crane.get(i) >= box.get(temp)) {
                        box.remove(temp);
                        break;
                    } else {
                        temp++;
                    }
                }
            }
            time++;
        }

        System.out.println(time);
    }
}
