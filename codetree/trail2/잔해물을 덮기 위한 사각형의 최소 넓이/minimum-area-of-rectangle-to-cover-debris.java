import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rect1_x1 = sc.nextInt();
        int rect1_y1 = sc.nextInt();
        int rect1_x2 = sc.nextInt();
        int rect1_y2 = sc.nextInt();
        int rect2_x1 = sc.nextInt();
        int rect2_y1 = sc.nextInt();
        int rect2_x2 = sc.nextInt();
        int rect2_y2 = sc.nextInt();
        // Please write your code here.

        int[][] arr = new int[2001][2001];
        int offset = 1000;
        for(int i = rect1_x1 ; i < rect1_x2 ; i++){
            for(int j = rect1_y1 ; j < rect1_y2 ; j++){
                arr[i + offset][j + offset]++;
            }
        }

        for(int i = rect2_x1 ; i < rect2_x2 ; i++){
            for(int j = rect2_y1 ; j < rect2_y2 ; j++){
                arr[i + offset][j + offset]--;
            }
        }

        int xMax = Integer.MIN_VALUE;
        int xMin = Integer.MAX_VALUE;
        int yMax = Integer.MIN_VALUE;
        int yMin = Integer.MAX_VALUE;
        for(int i = 0 ; i < 2001 ; i++){
            for(int j = 0 ; j < 2001 ; j++){
                if(arr[i][j] == 0){
                    continue;
                }

                if(arr[i][j] >= 1){
                    xMax = Math.max(xMax, (i-offset));
                    xMin = Math.min(xMin, (i-offset));
                    yMax = Math.max(yMax, (j-offset));
                    yMin = Math.min(yMin, (j-offset));
                }
            }
        }

        int answer = (xMax - xMin + 1) * (yMax - yMin + 1);
        if(rect2_x1 <= rect1_x1 && rect1_x2 <= rect2_x2 && rect2_y1 <= rect2_y1 && rect1_y2 <= rect2_y2){
            answer = 0;
        }
        System.out.println(answer);
    }
}