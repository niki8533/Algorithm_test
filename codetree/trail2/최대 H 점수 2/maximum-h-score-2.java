import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        // Please write your code here.

        int max = 0;
        for(int h = 0 ; h <= n ; h++){
            int already = 0;
            int need = 0;

            for(int i = 0 ; i < n ; i++){
                if(a[i] >= h){
                    already++;
                }
                else if(a[i] == (h - 1)){
                    need++;
                }
            }

            if((already + Math.min(need, l)) >= h){
                max = Math.max(max, h);
            }
        }

        System.out.println(max);
    }
}