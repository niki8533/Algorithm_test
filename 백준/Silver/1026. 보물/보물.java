import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//백준 - 보물
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());
        Integer[][] arr = new Integer[2][N];
        for(int i = 0 ; i < 2 ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < N ; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(arr[0]);
        Arrays.sort(arr[1], Collections.reverseOrder());

        int answer = 0;
        for(int i = 0 ; i < N ; i++){
            answer = answer + (arr[0][i] * arr[1][i]);
        }

        System.out.println(answer);
    }
}