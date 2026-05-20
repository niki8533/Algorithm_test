import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int[] checkS = new int[1001];
        int[] checkN = new int[1001];
        int cntS = 0;
        int cntN = 0;
        for (int i = 0; i < T; i++) {
            char c = sc.next().charAt(0);
            int pos = sc.nextInt();

            if(c == 'S'){
                checkS[cntS++] = pos;
            } else if(c == 'N'){
                checkN[cntN++] = pos;
            }
        }
        
        int answer = 0;
        for(int i = a ; i <= b ; i++){
            int disS = 1001;
            int disN = 1001;

            for(int j = 0 ; j < cntS ; j++){
                disS = Math.min(disS, Math.abs(i - checkS[j]));
            }
            for(int j = 0 ; j < cntN ; j++){
                disN = Math.min(disN, Math.abs(i - checkN[j]));
            }

            if(disS <= disN){
                answer++;
            }
        }
        System.out.println(answer);
    }
}