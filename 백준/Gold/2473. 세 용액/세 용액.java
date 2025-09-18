import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] arr = new long[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            arr[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);


        long[] answer = new long[3];
        Long temp = Long.MAX_VALUE;

        for(int i = 0 ; i < N ; i++) {
            int left = i + 1;
            int right = N - 1;

            while (left < right) {
                long sum = arr[i] + arr[left] + arr[right];

                if(Math.abs(sum) < temp){
                    temp = Math.abs(sum);
                    answer[0] = arr[i];
                    answer[1] = arr[left];
                    answer[2] = arr[right];
                }

                if(sum < 0){
                    left++;
                } else right--;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < 2 ; i++){
            sb.append(answer[i] + " ");
        }
        sb.append(answer[2]);
        System.out.println(sb);
    }
}
