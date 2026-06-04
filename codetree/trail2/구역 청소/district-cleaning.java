import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[4];
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr[0] = Integer.parseInt(st.nextToken());
        arr[1] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        arr[2] = Integer.parseInt(st.nextToken());
        arr[3] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        System.out.println(arr[3] - arr[0]);
    }
}