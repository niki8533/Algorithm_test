import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());

        String[] week = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        int[] dates = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int day1 = 0;
        for(int i = 0 ; i < m1 ; i++){
            day1 += dates[i];
        }
        day1 += d1;
        
        int day2 = 0;
        for(int i = 0 ; i < m2 ; i++){
            day2 += dates[i];
        }
        day2 += d2;

        int diff = (day2 - day1 + 1) % 7;

        if(diff < 0){
            diff += 7;
        }
        System.out.println(week[diff]);
    }
}