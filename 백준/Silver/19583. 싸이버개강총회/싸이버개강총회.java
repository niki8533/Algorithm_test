import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.util.*;

//백준 - 싸이버개강총회
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int start = toMinute(st.nextToken());
        int end = toMinute(st.nextToken());
        int quit = toMinute(st.nextToken());

        String str = null;
        Set<String> in = new HashSet<>();
        Set<String> out = new HashSet<>();

        while((str = br.readLine()) != null && !str.isEmpty()){
            st = new StringTokenizer(str);
            int chatTime = toMinute(st.nextToken());
            String name = st.nextToken();

            if(chatTime <= start){
                in.add(name);
            }
            if(chatTime >= end && chatTime <= quit){
                out.add(name);
            }
        }

        int answer = 0;
        for(String name : in){
            if(out.contains(name)){
                answer++;
            }
        }

        System.out.println(answer);
    }

    static int toMinute(String time) {
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }
}
