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
            String[] arr = str.split("");
            
            int index = arr.length - 1;
            boolean isPal = true;
            for(int j = 0 ; j < arr.length / 2 ; j++){
                if(!arr[j].equals(arr[index])){
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