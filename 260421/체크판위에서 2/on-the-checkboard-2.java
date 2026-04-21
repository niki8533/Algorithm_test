import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        char[][] arr = new char[R][C];
        for(int i = 0 ; i < R ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < C ; j++){
                arr[i][j] = st.nextToken().charAt(0);
            }
        }
        
        int count = 0;
        for(int i = 1 ; i < R - 1 ; i++){
            for(int j = 1 ; j < C - 1 ; j++){
                for(int k = i + 1 ; k < R - 1 ; k++){
                    for(int l = j + 1 ; l < C - 1 ; l++){
                        if(arr[0][0] != arr[i][j] && arr[i][j] != arr[k][l] && arr[k][l] != arr[R - 1][C - 1]){
                            count++;
                        }
                    }
                }
            }
        }

        System.out.println(count);
    }
}