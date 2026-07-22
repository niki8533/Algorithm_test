import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.

        Arrays.sort(arr);
        
        if(arr[n-1] < 0){
            System.out.println(arr[n-3]*arr[n-2]*arr[n-1]);
        }
        else if(arr[0] * arr[1] > arr[n - 3] * arr[n-2]){
            System.out.println(arr[0]*arr[1]*arr[n-1]);
        } else {
            System.out.println(arr[n-3]*arr[n-2]*arr[n-1]);
        }
    }
}