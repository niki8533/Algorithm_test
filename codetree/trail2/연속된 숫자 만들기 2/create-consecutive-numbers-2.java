import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        // Please write your code here.

        Arrays.sort(arr);

        int count = 0;
        if((arr[1] - arr[0]) > 2 && (arr[1]+1) == arr[2]){
            count = 2;
        }
        else if((arr[2] - arr[1]) > 2 && (arr[0]+1) == arr[1]){
            count = 2;
        }
        else if((arr[2] - arr[1]) > 2 && (arr[1] - arr[0]) > 2){
            count = 2;
        }
        else if((arr[1] - arr[0]) == 2 || (arr[2] - arr[1])== 2){
            count = 1;
        }

        System.out.println(count);
    }
}