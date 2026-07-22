import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        System.out.println(max(n, m));
    }

    public static int max(int n, int m){
        int divisor = 1;
        int max = 0;
        while(divisor <= n || divisor <= m){
            if(n % divisor == 0 && m % divisor == 0){
                max = Math.max(max, divisor);
            }
            divisor++;
        }

        return max;
    }
}