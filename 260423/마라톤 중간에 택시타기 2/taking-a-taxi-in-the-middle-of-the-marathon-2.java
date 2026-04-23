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

            for(int j = 0 ; j < n - 2 ; j++){
                if(i == j){
                    continue;
                }
                distance = distance + (Math.abs(x[j] - x[j + 1]) + Math.abs(y[j] - y[j + 1]));
            }

            System.out.println(distance);
            min = Math.min(min, distance);
        }
        System.out.println();
        System.out.println(min);

    }
}