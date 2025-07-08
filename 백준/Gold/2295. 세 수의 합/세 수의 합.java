import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int U = Integer.parseInt(br.readLine());

        int[] arr = new int[U];
        for(int i = 0 ; i < U ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < U ; i++){
            for(int j = i ; j < U ; j++){
                set.add(arr[i]+arr[j]);
            }
        }

        int max = -1;
        for(int i = 0 ; i < U ; i++){
            for(int j = 0 ; j < U ; j++){
                if(set.contains(arr[i] - arr[j])){
                    max = Math.max(max, arr[i]);
                }
            }
        }

        System.out.println(max);
    }
}
