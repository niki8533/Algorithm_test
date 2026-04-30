import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] candies = new int[n];
        int[] positions = new int[n];
        for (int i = 0; i < n; i++) {
            candies[i] = sc.nextInt();
            positions[i] = sc.nextInt();
        }
        // Please write your code here.
        int[] temp = new int[n];
        for(int i = 0 ; i < n ; i++){
            temp[i] = positions[i];
        }
        Arrays.sort(temp);
        
        int max = 0;
        for(int i = 0 + k ; i < temp[n-1] - k ; i++){
            int candy = 0;
            for(int j = 0 ; j < n ; j++){
                if(positions[j] >= i - k && positions[j] <= i + k){
                    candy += candies[j];
                }
            }
            
            max = Math.max(max, candy);
        }

        System.out.println(max);
    }
}