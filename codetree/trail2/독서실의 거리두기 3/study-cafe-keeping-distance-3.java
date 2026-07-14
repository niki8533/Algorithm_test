import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String seats = sc.next();
        // Please write your code here.
        int[] arr = new int[N];
        for(int i = 0 ; i < N ; i++){
            char c = seats.charAt(i);

            arr[i] = c - 48;
        }

        int maxDistance = 0;
        int maxI = 0;
        int maxJ = 0;
        for(int i = 0 ; i < N ; i++){
            if(arr[i] == 0) continue;

            for(int j = i + 1 ; j < N ; j++){
                if(arr[j] == 1){
                    if((j - i) > maxDistance){
                        maxDistance = j - i;

                        maxI = i;
                        maxJ = j;
                    }

                    break;
                }
            }
        }

        arr[(maxI + maxJ) / 2] = 1;

        int answer = Integer.MAX_VALUE;
        for(int i = 0 ; i < N ; i++){
            if(arr[i] == 0) continue;

            for(int j = i + 1 ; j < N ; j++){
                if(arr[j] == 1){
                    answer = Math.min(answer, (j - i));
                    break;
                }
            }
        }

        System.out.println(answer);
    }
}