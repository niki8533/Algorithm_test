import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        // Please write your code here.
        int count = 0;
        int max = 1;
        boolean isNegative = false;
        for(int i = 0 ; i < n ; i++){
            boolean temp = false;

            if(arr[i] < 0){
                temp = true;
            } else temp = false;

            if(isNegative == temp){
                count++;
            } else {
                isNegative = temp;
                count = 1;
            }
            max = Math.max(max, count);
        }

        System.out.println(max);
    }
}