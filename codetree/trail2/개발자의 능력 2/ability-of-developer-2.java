import java.util.*;
import java.io.*;

public class Main {
    static int[] arr = new int[6];
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i < 6 ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int diff = Integer.MAX_VALUE;
        for(int i = 0 ; i < 6 ; i++){
            int max = 0;
            int min = 0;
            int teamA = 0;
            int teamB = 0;
            int teamC = 0;

            for(int j = i + 1 ; j < 6 ; j++){
                teamA = arr[i] + arr[j];
                for(int k = 0 ; k < 6 ; k++){
                    if(k == i || k == j){
                        continue;
                    }
                    for(int l = k + 1 ; l < 6 ; l++){
                        if(l == i || l == j){
                            continue;
                        }

                        teamB = arr[k] + arr[l];

                        for(int m = 0 ; m < 6 ; m++){
                            if(m == i || m == j || m == k || m == l){
                                continue;
                            }
                            for(int n = m + 1 ; n < 6 ; n++){
                                if(n == i || n == j || n == k || n == l){
                                    continue;
                                }
                                teamC = arr[m] + arr[n];

                                max = Math.max(teamA, Math.max(teamB, teamC));
                                min = Math.min(teamA, Math.min(teamB, teamC));

                                diff = Math.min(diff, max - min);
                            }
                        }
                    }
                }
            }
        }

        System.out.println(diff);
    }
}