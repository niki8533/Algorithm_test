import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String A = sc.next();
        // Please write your code here.
        String[] week = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int index = 0;
        for(int i = 0 ; i < 7 ; i++){
            if(week[i].equals(A)){
                index = i;
            }
        }

        int[] dates = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int day1 = d1;
        for(int i = 0 ; i < m1 ; i++){
            day1 += dates[i];
        }

        int day2 = d2;
        for(int i = 0 ; i < m2 ; i++){
            day2 += dates[i];
        }

        int answer = 0;
        int diff = (day2 - day1 + 1);
        if(index < (diff % 7)){
            answer = 1;
        }

        answer += (diff / 7);
        System.out.println(answer);
    }
}