import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int p = sc.nextInt();
        char[] c = new char[M];
        int[] u = new int[M];
        for (int i = 0; i < M; i++) {
            c[i] = sc.next().charAt(0);
            u[i] = sc.nextInt();
        }
        // Please write your code here.
        HashSet<Character> set = new HashSet<>();
        for(int i = 0 ; i < N ; i++){
            set.add((char)('A' + i));
        }
        
        if(u[p-1] > 0){
            for(int i = p - 1 ; i < M ; i++){
                if(set.contains(c[i])){
                    set.remove(c[i]);
                }
            }

            for(char ch : set){
                System.out.print(ch + " ");
            }
        }
    }
}