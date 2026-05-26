import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        // Please write your code here.
        int count = 0;
        for(int i = x ; i <= y ; i++){
            String str = String.valueOf(i);
            
            int index = str.length() - 1;
            boolean isPal = true;
            for(int j = 0 ; j < str.length() / 2 ; j++){
                char c1 = str.charAt(j);
                char c2 = str.charAt(index);

                if(c1 != c2){
                    isPal = false;

                }
                
                index--;
            }

            if(isPal){
                count++;
            }
        }

        System.out.println(count);
    }
}