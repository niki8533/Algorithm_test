import java.util.*;

public class Main {
    public static void main(String[] args){
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        
        int count = 0;

        if(arr[1] - arr[0] > arr[2] - arr[1]){
            count = arr[1] - (arr[0] + 1);
        }
        else if(arr[1] - arr[0] < arr[2] - arr[1]){
            count = (arr[2] - 1) - arr[1];
        }

        System.out.println(count);
    }
}