import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());

        int[] arr = new int[A];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < A ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < A ; i++){
            if(list.isEmpty() || arr[i] > list.get(list.size() - 1)){
                list.add(arr[i]);
            } else {
                int index = Collections.binarySearch(list, arr[i]);
                if(index < 0) {
                    index = -(index + 1);
                }
                list.set(index, arr[i]);
            }
        }

        System.out.println(list.size());
    }
}
