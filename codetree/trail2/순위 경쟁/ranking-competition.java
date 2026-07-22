import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int[] arr = new int[3];
        String honor = "ABC";
        for (int i = 0; i < n; i++) {
            char c = sc.next().charAt(0);
            int s = sc.nextInt();

            if(c == 'A') arr[0]+=s;
            else if(c == 'B') arr[1]+=s;
            else arr[2]+=s;

            int max = Math.max(arr[0], Math.max(arr[1], arr[2]));

            StringBuilder sb = new StringBuilder();
            
            if(max == arr[0]){
                sb.append("A");
            } if(max == arr[1]){
                sb.append("B");
            } if(max == arr[2]){
                sb.append("C");
            }

            String compare = sb.toString();
            if(!honor.equals(compare)){
                count++;
                honor = compare;
            }
        }
        // Please write your code here.
        System.out.println(count);
    }
}