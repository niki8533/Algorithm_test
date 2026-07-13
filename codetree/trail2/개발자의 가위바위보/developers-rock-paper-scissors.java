import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rock = 0;
        int scissors = 0;
        int paper = 0;
        for(int i = 0; i < n; i++){
            int first = sc.nextInt();
            int second = sc.nextInt();

            //1:가위  2:바위  3:보
            if(first == 1 && second == 3){
                scissors++;
            }

            //1:가위  2:보  3:바위
            if(first == 1 && second == 2){
                //가위승++;
                scissors++;
            }

            //1:바위  2:가위  3:보
            if(first == 1 && second == 3){
                rock++;
            }

            //1:바위  2:보  3:가위
            if(first == 1 && second == 2){
                rock++;
            }

            //1:보  2:바위  3:가위
            if(first == 1 && second == 3){
                paper++;
            }

            //1:보  2:가위  3:바위
            if(first == 1 && second == 2){
                paper++;
            }

        }
        // Please write your code here.
        System.out.println(Math.max(scissors, Math.max(rock, paper)));
    }
}