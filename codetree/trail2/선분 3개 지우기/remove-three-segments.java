import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[][] arr = new int[N][2];
        for(int i = 0 ; i < N ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        for(int i = 0 ; i < N ; i++){
            for(int j = i + 1 ; j < N ; j++){
                for(int k = j + 1 ; k < N ; k++){
                    int[] temp = new int[101];
                    for(int num = 0 ; num < N ; num++){
                        if(num == i || num == j || num == k){
                            continue;
                        }
                        
                        for(int l = arr[num][0] ; l <= arr[num][1] ; l++){
                            temp[l]++;
                        }
                    }

                    boolean isTrue = true;
                    for(int l = 0 ; l < 95 ; l++){
                        //System.out.print(temp[l] + " ");
                        if(temp[l] >= 2){
                            isTrue = false;
                            break;
                        }
                    }
                    //System.out.println();
                    if(isTrue){
                        count++;
                    }
                }

            }
        }

        System.out.println(count);
    }
}