import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.

        int max = arr[0] + arr[1] + arr[2];
        for(int i = 0 ; i < n - k ; i++){
            int sum = 0;
            for(int j = i ; j < i + k ; j++){
                sum += arr[j];
            }

            max = Math.max(sum, max);
        }

        System.out.println(max);
    }
}