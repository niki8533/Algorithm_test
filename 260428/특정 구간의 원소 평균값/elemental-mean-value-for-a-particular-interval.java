import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.

        int count = 0;
        for(int i = 0 ; i < n ; i++){
            int sum = 0;
            for(int j = i ; j < n ; j++){
                
                sum += arr[j];

                int length = Math.abs(i - j)  + 1;
                if(sum % length == 0){
                    int avg = sum / length;
                }

                for(int k = i ; k <= j ; k++){
                    if(arr[k] == avg){
                        count++;
                        break;
                    }
                }
            }
        }

        System.out.println(count);
    }
}