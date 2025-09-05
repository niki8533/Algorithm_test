import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            int n = Integer.parseInt(st.nextToken());
            arr[i] = n;
            list.add(n);
        }

        Arrays.sort(arr);

        int answer = 0;
        for(int i = 0 ; i < N ; i++){
            int left = 0;
            int right = arr.length - 1;

            while(left < right){
                if(left == i){
                    left++;
                    continue;
                } else if(right == i) {
                    right--;
                    continue;
                }
                
                int sum = arr[left] + arr[right];
                if(sum == arr[i]){
                    answer++;
                    break;
                } else if(sum < arr[i]){
                    left++;
                } else {
                    right--;
                }
            }
        }

        System.out.println(answer);
    }
}
