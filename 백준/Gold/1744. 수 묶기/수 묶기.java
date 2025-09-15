import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        boolean isZero = false;
        ArrayList<Integer> over = new ArrayList<>();
        ArrayList<Integer> under = new ArrayList<>();
        for(int i = 0 ; i < N ; i++){
            int n = Integer.parseInt(br.readLine());
            if(n > 1){
                over.add(n);
            } else if(n < 0){
                under.add(n);
            } else if(n == 1){
                sum++;
            } else {
                isZero = true;
            }
        }

        Collections.sort(under);
        Collections.sort(over, Collections.reverseOrder());

        for(int i = 0 ; i < over.size() - 1 ; i = i+2){
            sum = sum + (over.get(i) * over.get(i+1));
        }
        if(over.size() % 2 == 1){
            sum = sum + over.get(over.size() - 1);
        }

        for(int i = 0 ; i < under.size() - 1 ; i = i+2){
            sum = sum + (under.get(i) * under.get(i+1));
        }
        if(under.size() % 2 == 1){
            if(!isZero) {
                sum = sum + under.get(under.size() - 1);
            }
        }

        System.out.println(sum);
    }
}
