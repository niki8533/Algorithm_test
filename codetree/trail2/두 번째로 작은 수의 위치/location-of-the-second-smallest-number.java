import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[101];
        int[] index = new int[101];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = Integer.MAX_VALUE;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < N ; i++){
            int num = Integer.parseInt(st.nextToken());
            arr[num]++;
            index[num] = i + 1;
            set.add(num);
        }

        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        
        if(list.size() == 1){
            System.out.println(-1);
        } else if(arr[list.get(1)] == 1){
            System.out.println(index[list.get(1)]);
        } else System.out.println(-1);
    }
}