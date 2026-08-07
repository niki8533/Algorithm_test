import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        int index = 0;
        while(n > 1){
            sb.append((n%2));
            index++;
            n /= 2;
        }
        sb.append(n);
        System.out.println(sb.reverse());
    }
}