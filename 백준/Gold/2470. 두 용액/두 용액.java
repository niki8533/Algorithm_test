import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

//백준 - 두 용액
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> map = new HashMap<>();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0  ; i < N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int left = 0;
        int right = N - 1;
        int sum = Integer.MAX_VALUE;
        int[] answer = new int[2];
        while(left < right){
            int temp = Math.abs(arr[left] + arr[right]);
            if(sum > temp){
                sum = temp;
                answer[0] = arr[left];
                answer[1] = arr[right];
            }
            else if(arr[left] + arr[right] < 0){
                left++;
            } else if(arr[left] + arr[right] > 0) {
                right--;
            } else if(temp == 0){
                answer[0] = arr[left];
                answer[1] = arr[right];
                break;
            }
        }

        System.out.println(answer[0] + " " + answer[1]);
    }
}
