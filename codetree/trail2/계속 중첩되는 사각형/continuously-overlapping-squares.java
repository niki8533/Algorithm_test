import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] y1 = new int[n];
        int[] x2 = new int[n];
        int[] y2 = new int[n];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            y1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
            y2[i] = sc.nextInt();
        }
        // Please write your code here.
        char[][] arr = new char[201][201];
        int offset = 100;
        for(int p = 0 ; p < n ; p++){
            for(int i = x1[p] ; i < x2[p] ; i++){
                for(int j = y1[p] ; j < y2[p] ; j++){
                    if(p % 2 == 0){
                        arr[i+offset][j+offset] = 'r';
                    } else arr[i+offset][j+offset] = 'b';
                }
            }
        }

        int count = 0;
        for(int i = 0 ; i < 201 ; i++){
            for(int j = 0 ; j < 201 ; j++){
                if(arr[i][j] == 'b'){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
