import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int win1 = 0;
        int win2 = 0;
        int[] answer = new int[6];
        for(int i = 0; i < n; i++){
            int first = sc.nextInt();
            int second = sc.nextInt();

            //1:가위  2:바위  3:보
            if(first == 1 && second == 3){
                win1++;
            }
            if(first == 2 && second == 1){
                win1++;
            }
            if(first == 3 && second == 2){
                win1++;
            }

            //1:가위  2:보    3:바위
            if(first == 1 && second == 2){
                win2++;
            }
            if(first == 2 && second == 3){
                win2++;
            }
            if(first == 3 && second == 1){
                win2++;
            }

        }
        // Please write your code here.
        System.out.println(Math.max(win1, win2));
    }
}


       