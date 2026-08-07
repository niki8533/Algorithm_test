import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        int index = 0;
        int answer = 0;
        while(n > 1){
            answer +=(n%2) * (int)Math.pow(10, index);
            index++;
            n /= 2;
        }
        answer += n * (int)Math.pow(10, index);
        System.out.println(answer);
    }
}