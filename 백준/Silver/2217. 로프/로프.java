import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//백준 - 로프
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int[] weight = new int[N];
        for(int i = 0 ; i < N ; i++){
            for(int j = i ; j < N ; j++){
                weight[i] += arr[i];
            }
        }

        Arrays.sort(weight);

        System.out.println(weight[N-1]);

    }
}
