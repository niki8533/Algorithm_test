import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int min = Integer.MAX_VALUE;
        for(int i = 1 ; i <= 83 ; i++){
            int cost = 0;
            for(int j = 0 ; j < n ; j++){
                if(i <= arr[j] && arr[j] <= i + 17){
                    continue;
                } else if(arr[j] < i){
                    cost += (i - arr[j]) * (i - arr[j]);
                } else cost += (arr[j] - (i + 17)) * (arr[j] - (i + 17));
            }

            min = Math.min(cost, min);
        }

        System.out.println(min);
    }
}