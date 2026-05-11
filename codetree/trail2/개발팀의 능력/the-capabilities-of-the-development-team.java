import java.util.Scanner;
public class Main {
    static int total = 0;
    static int[] arr = new int[5];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0 ; i < 5 ; i++){
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        // Please write your code here.

        int teamA = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < 5 ; i++){
            for(int j = i+1 ; j < 5 ; j++){
                teamA = arr[i] + arr[j];
                min = Math.min(min, diff(i, j, teamA));
            }
        }
        if(min == Integer.MAX_VALUE){
            min = -1;
        }

        System.out.println(min);
    }

    public static int diff(int i, int j, int teamA){
        int teamB = 0;
        int teamC = 0;
        int teamMin = Integer.MAX_VALUE;

        for(int x = 0 ; x < 5 ; x++){
            if(x == i || x == j){
                continue;
            }
            for(int y = x + 1 ; y < 5 ; y++){
                if(y == i || y == j){
                    continue;
                }

                teamB = arr[x] + arr[y];
                teamC = total - (teamA + teamB);
                
                if(teamA != teamB && teamB != teamC && teamA != teamC){
                    int max = Math.max(teamA, Math.max(teamB, teamC));
                    int min = Math.min(teamA, Math.min(teamB, teamC));

                    teamMin = Math.min(teamMin, max-min);
                }
                
            }
        }
        return teamMin;
    }
}