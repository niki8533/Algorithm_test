import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];
        for(int i = 0 ; i < N ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int answer = 0;
        for(int i = 0 ; i <= 10 ; i++){
            for(int j = 0 ; j <= 10 ; j++){
                for(int k = 0 ; k <= 10 ; k++){
                    boolean canPass = true;

                    for(int l = 0 ; l < N ; l++){
                        if(arr[l][0] == i || arr[l][0] == j || arr[l][0] == k){
                            canPass = true;
                        }
                        else if(arr[l][1] == i || arr[l][1] == j || arr[l][1] == k){
                            canPass = true;
                        }
                        else canPass = false;
                    }

                    if(canPass){
                        answer = 1;
                        System.out.println(answer);
                        return;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}