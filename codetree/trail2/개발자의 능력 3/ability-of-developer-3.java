import java.util.*;

public class Main {
    static int[] ability = new int[6];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 6; i++) {
            ability[i] = sc.nextInt();
        }
        // Please write your code here.
        Arrays.sort(ability);

        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < 4 ; i++){
            for(int j = i + 1 ; j < 5 ; j++){
                for(int k = j + 1 ; k < 6 ; k++){
                    min = Math.min(min, calc(i, j, k));
                }
            }
        }

        System.out.println(min);
    }

    public static int calc(int i, int j, int k){
        int teamA = ability[i] + ability[j] + ability[k];
        int teamB = 0;

        for(int x = 0 ; x < 6 ; x++){
            if(x != i && x != j && x != k){
                teamB += ability[x];
            }
        }

        return Math.abs(teamA - teamB);
    }
}