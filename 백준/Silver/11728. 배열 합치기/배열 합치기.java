//백준 - 배열 합치기

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] a = new int[N];
        int[] b = new int[M];
        ArrayList<Integer> list = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            list.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < M ; i++){
            list.add(Integer.parseInt(st.nextToken()));
        }

        int[] arr = new int[list.size()];
        for(int i = 0 ; i < list.size() ; i++){
            arr[i] = list.get(i);
        }

        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < arr.length - 1 ; i++){
            sb.append(arr[i] + " ");
        }

        sb.append(arr[arr.length - 1]);
        System.out.println(sb);
    }
}
