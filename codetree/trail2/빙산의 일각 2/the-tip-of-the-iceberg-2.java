import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        int maxH = 0;
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
            maxH = Math.max(maxH, h[i]);
        }

        // Please write your code here.
        int answer = 0;
        for(int i = 1 ; i < maxH ; i++){
            int count = 0;
            boolean isNew = false;
            for(int j = 0 ; j < n ; j++){
                if(h[j] >= i){
                    if(!isNew){
                        isNew = true;
                        count++;
                    }
                } else{
                    isNew = false;
                }
            }

            answer = Math.max(answer , count);
        }
        
        System.out.println(answer);
    }
}