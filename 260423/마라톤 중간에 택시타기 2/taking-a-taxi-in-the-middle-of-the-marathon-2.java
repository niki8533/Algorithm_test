import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        // Please write your code here.
        int min = Integer.MAX_VALUE;
        for(int i = 1 ; i < n - 1 ; i++){
            int distance = 0;
            int prepix = 0;

            for(int j = 1 ; j < n ; j++){
                if(i != j){
                    distance = distance + (Math.abs(x[prepix] - x[j]) + Math.abs(y[prepix] - y[j]));
                    prepix = j;
                }
            }

            min = Math.min(min, distance);
        }
        System.out.println(min);

    }
}