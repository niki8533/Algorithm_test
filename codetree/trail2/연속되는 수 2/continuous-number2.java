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
        int count = 1;
        int max = 0;
        for(int i = 1 ; i < n ; i++){
            if(arr[i - 1] == arr[i]){
                count++;
                
            } else count = 1;

            max = Math.max(max, count);
        }

        System.out.println(max);
    }
}