import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        Stack<Integer> s = new Stack<>();
        int max = 0;
        int index = 0;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] > t){
                s.add(arr[i]);
                index = i;
                break;
            }
        }

        if(s.isEmpty()){
            System.out.println(0);
            return;
        }

        for(int i = index ; i < n ; i++){
            if(arr[i] < s.peek()){
                max = Math.max(max, s.size());
                s = new Stack<>();
                s.add(arr[i]);
            } else if(arr[i] > s.peek()  && arr[i] > t){
                s.add(arr[i]);
            } else continue;
        }

        max = Math.max(max, s.size());
        System.out.println(max);
    }
}