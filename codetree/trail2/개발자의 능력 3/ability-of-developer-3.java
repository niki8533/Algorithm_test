import java.util.Scanner;

public class Main {
    static int[] arr = new int[6];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < 6 ; i++){
            for(int j = i+1 ; j < 6 ; j++){
                int sum = 0;
                for(int k = j + 1 ; k < 6 ; k++){
                    sum = arr[i] + arr[j] + arr[k];
                    
                    min = Math.min(min, diff(i, j, k, sum));
                }
            }
        }

        System.out.println(min);
    }

    public static int diff(int i, int j, int k, int teamA){
        int sum = 0;
        for(int x = 0 ; x < 6 ; x++){
            if(x != i && x != j && x != k){
                sum += arr[x];
            }
        }

        return Math.abs(teamA - sum);
    }
}