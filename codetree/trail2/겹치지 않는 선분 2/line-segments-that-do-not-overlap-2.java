import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        // Please write your code here.
        Arrays.sort(arr, (o1, o2) -> {
            return o1[0] - o2[0];
        });

        int count = 0;
        for(int i = 0 ; i < n ; i++){
            boolean isIsolate = true;

            for(int j = 0 ; j < n ; j++){
                if(i ==j) continue;

                if ((arr[i][0] <= arr[j][0] && arr[i][1] >= arr[j][1]) || 
                    (arr[i][0] >= arr[j][0] && arr[i][1] <= arr[j][1])) {
                    isIsolate = false;
                break;
}
            }

            if(isIsolate){
                count++;
            }   
        }

        System.out.println(count);
    }
}
