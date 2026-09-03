import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int max = 1;
        Stack<Integer> s = new Stack<>();
        s.add(arr[0]);
        for(int i = 1 ; i < n ; i++){
            if(arr[i] < s.peek()){
                max = Math.max(max, s.size());
                s = new Stack<>();
                s.add(arr[i]);
            } else if(arr[i] > s.peek()){
                s.add(arr[i]);
            } else continue;
        }

        max = Math.max(max, s.size());
        System.out.println(max);
    }
}