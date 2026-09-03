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
        Stack<Integer> s = new Stack<>();
        s.add(arr[0]);
        for(int i = 1 ; i < n ; i++){
            if(arr[i] < s.peek()){
                s = new Stack<>();
                s.add(arr[i]);
            } else if(arr[i] > s.peek()){
                s.add(arr[i]);
            } else continue;
        }

        System.out.println(s.size());
    }
}