import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String seats = sc.next();
        // Please write your code here.

        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            char c = seats.charAt(i);

            arr[i] = c - 48;
        }

        int maxmin = 0;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] == 1) continue;
            
            int[] temp = new int[n];
            for(int j = 0 ; j < n ; j++){
                if(i == j) temp[j] = 1;
                else temp[j] = arr[j];
            }

            maxmin = Math.max(maxmin, distance(temp));
        }

        System.out.println(maxmin);
    }

    public static int distance(int[] arr){
        int min = Integer.MAX_VALUE;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 0) continue;

            for(int j = i + 1 ; j < arr.length ; j++){
                if(arr[j] == 1)
                min = Math.min(min, (j - i));
            }
        }

        return min;
    }
}