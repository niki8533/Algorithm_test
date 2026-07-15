import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[2];
        int count = 0;
        int status = 3;
        for (int i = 0; i < n; i++) {
            int temp = 0;
            char c = sc.next().charAt(0);
            int s = sc.nextInt();

            if(c == 'A'){
                arr[0] += s;
            } else arr[1] += s;

            if(arr[0] == arr[1]){
                temp = 3;
            } else if(arr[0] > arr[1]){
                temp = 1;
            } else temp = 2;

            if(temp != status){
                count++;
                status = temp;
            }
        }
        // Please write your code here.
        System.out.println(count);
    }
}