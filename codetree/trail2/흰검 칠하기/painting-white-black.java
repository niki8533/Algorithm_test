import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int offset = 100000;

        int index = 0;
        HashSet<Integer> set = new HashSet<>(); 
        int[] wc = new int[200001];
        int[] bc = new int[200001];
        char[] color = new char[200001];
        for(int i = 0 ; i < n ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            char d = st.nextToken().charAt(0);

            if(d == 'L'){
                for(int j = (index - x) + 1 ; j <= index ; j++){
                   wc[j + offset]++;
                   color[j + offset] = 'W';
                   set.add(j + offset);
                }
                index = (index - x) + 1;
            } else {
                for(int j = index ; j < (index + x) ; j++){
                    bc[j + offset]++;
                    color[j + offset] = 'B';
                    set.add(j + offset);
                }
                index = (index + x) - 1;
            }
        }

        int white = 0;
        int black = 0;
        int gray = 0;
        for(int i : set){
            if(wc[i] >= 2 && bc[i] >= 2){
                gray++;
            } else if(color[i] == 'W'){
                white++;
            } else if(color[i] == 'B'){
                black++;
            }
        }
        System.out.println(white + " " + black + " " + gray);
    }
}