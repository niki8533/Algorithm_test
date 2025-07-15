import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

//백준 - 배부른 마라토너
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> set = new HashSet<>();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < (N*2)-1 ; i++){
            String name = br.readLine();

            if(set.contains(name)){
                set.remove(name);
            } else set.add(name);
        }

        for(String name : set){
            System.out.println(name);
        }
    }
}
