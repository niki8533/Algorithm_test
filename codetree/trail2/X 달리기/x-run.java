import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        int speed = 1;
        int time = 0;
        while(true){
            int accel = speed * (speed + 1) / 2;
            int decel = speed * (speed - 1) / 2;

            if(x <= accel + decel){
                time = 2 * speed - 1;
                break;
            }

            if(x <= accel * 2){
                time = 2 * speed;
                break;
            }

            speed++;
        }
        
        System.out.println(time);
    }
}