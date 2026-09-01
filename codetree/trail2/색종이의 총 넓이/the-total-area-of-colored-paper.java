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
        int[][] arr = new int[201][201];
        int offset = 100;

        for(int p = 0 ; p < n ; p++){
            for(int i = x[p] ; i < x[p] + 8 ; i++){
                for(int j = y[p]; j < y[p] + 8 ; j++){
                    arr[i+offset][j+offset]++;
                }
            }
        }

        int count = 0;
        for(int i = 0 ; i < 201 ; i++){
            for(int j = 0 ; j < 201 ; j++){
                if(arr[i][j] == 0) continue;

                if(arr[i][j] >= 1) count++;
            }
        }

        System.out.println(count);
    }
}