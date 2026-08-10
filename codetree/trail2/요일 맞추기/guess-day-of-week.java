import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.

        int[] dates = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        int day1 = d1;
        int day2 = d2;

        for(int i = 0 ; i < m1 ; i++){
            day1 += dates[i];
        }

        for(int i = 0 ; i < m2 ; i++){
            day2 += dates[i];
        }

        int diff = (day2 - day1 + 1) % 7;

        if(diff < 0){
            diff += 7;
        }

        System.out.println(week[diff]);
    }
}