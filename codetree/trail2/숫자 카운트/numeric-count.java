import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int[] count1 = new int[n];
        int[] count2 = new int[n];
        int[] arr = new int[999];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
            count1[i] = sc.nextInt();
            count2[i] = sc.nextInt();
        }
        // Please write your code here.
        int count = 0;
        for(int l = 0 ; l < n ; l++){
            int first = num[l] / 100;
            int second = (num[l] / 10) % 10;
            int third = num[l] % 10;
            
            for(int i = 1 ; i <= 9 ; i++){
                for(int j = 1 ; j <= 9 ; j++){
                    for(int k = 1 ; k <= 9 ; k++){
                        if(i == j || j == k || k == i){
                            continue;
                        }

                        int cnt1 = 0;
                        int cnt2 = 0;

                        if(first == i){
                            cnt1++;
                        }
                        else if(first == j || first == k){
                            cnt2++;
                        }

                        if(second == j){
                            cnt1++;
                        }
                        else if(second == i || second == k){
                            cnt2++;
                        }

                        if(third == k){
                            cnt1++;
                        }
                        else if(third == j || third == i){
                            cnt2++;
                        }

                        if(cnt1 == count1[l] && cnt2 == count2[l]){
                            int temp = i*100 + j*10 + k;
                            arr[temp]++;
                        }
                    }
                }
            }
        }

        for(int i = 123 ; i <= 987 ; i++){
            if(arr[i] == n){
                count++;
            }
        }
        System.out.println(count);
    }
}