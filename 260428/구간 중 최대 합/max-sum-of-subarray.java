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

        int max = 0;
        for(int i = 0 ; i < n - 3 ; i++){
            max = Math.max(max, arr[i] + arr[i+1] + arr[i+2]);
        }

        System.out.println(max);
    }
}