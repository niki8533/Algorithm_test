import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];
        for(int i = 0 ; i < N ; i++){
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, (o1, o2) -> {
            if(o1.length() != o2.length()){
                return o1.length() - o2.length();
            } else {
                int sum1 = digitSum(o1);
                int sum2 = digitSum(o2);

                if(sum1 == sum2){
                    return o1.compareTo(o2);
                } else{
                    return sum1 - sum2;
                }
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < N ; i++){
            sb.append(arr[i]).append("\n");
        }

        System.out.println(sb);
    }
    
    public static int digitSum(String o1){
        int sum1 = 0;

        for(int i = 0 ; i < o1.length() ; i++){
            char c1 = o1.charAt(i);

            if(c1 >= 48 && c1 <= 57) {
                sum1 = sum1 + c1 - '0';
            }
        }
        
        return sum1;
    }
}
