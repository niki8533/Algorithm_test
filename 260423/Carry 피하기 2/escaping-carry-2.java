import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = 0;
        for(int i = 0 ; i < N - 2 ; i++){
            for(int j = i + 1 ; j < N - 1 ; j++){
                for(int k = j + 1 ; k < N ; k++){
                    int sum = 0;
                    boolean carry = false;

                    int tempI = arr[i];
                    int tempJ = arr[j];
                    int tempK = arr[k];

                    while(tempI > 0 || tempJ > 0 || tempK > 0){
                        int digitSum = (tempI % 10) + (tempJ % 10) + (tempK % 10);
    
                        if (digitSum >= 10) {
                            carry = true;
                            break; // carry가 한 번이라도 발생하면 불가능한 조합이므로 더 볼 필요 없이 탈출!
                        }

                        tempI /= 10;
                        tempJ /= 10;
                        tempK /= 10;
                    }

                    if(!carry)
                        sum = arr[i]+arr[j]+arr[k];

                    max = Math.max(sum, max);
                }
            }
        }

        System.out.println(max);
    }
}