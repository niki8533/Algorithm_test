import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//백준 - 신입 사원
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for(int test = 0 ; test < T ; test++){
            int N = Integer.parseInt(br.readLine());
            int[][] arr = new int[N][2];
            for(int i = 0 ; i < N ; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                arr[i][0] = Integer.parseInt(st.nextToken());
                arr[i][1] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr, (o1, o2) -> {
                if(o1[0] == o2[0]){
                    return o1[1] - o2[1];
                }
                else return o1[0] - o2[0];
            });


            int answer = 1;
            int min = arr[0][1];
            for(int i = 1 ; i < N ; i++){
                if(min > arr[i][1]){
                    min = arr[i][1];
                    answer++;
                }
            }
            sb.append(answer).append("\n");
        }

        System.out.print(sb);
    }
}