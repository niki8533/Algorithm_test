import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] arr = new char[3][3];
        for(int i = 0 ; i < 3 ; i++){
            String str = br.readLine();
            for(int j = 0 ; j < 3 ; j++){
                arr[i][j] = str.charAt(j);
            }
        }

        
        HashSet<String> answer = new HashSet<>();
        for(int i = 0 ; i < 3 ; i++){
            HashSet<Character> set = new HashSet<>();
            //가로 확인
            set.add(arr[i][0]);
            set.add(arr[i][1]);
            set.add(arr[i][2]);

            if(set.size() == 2){
                StringBuilder sb = new StringBuilder();
                for(char c : set){
                    sb.append(c);
                }
                answer.add(sb.toString());
            }
            //세로확인
            //arr[0][i], arr[1][i], arr[2][i]
        }

        for(int i = 0 ; i < 3 ; i++){
            HashSet<Character> set = new HashSet<>();
            //세로 확인
            set.add(arr[0][i]);
            set.add(arr[1][i]);
            set.add(arr[2][i]);

            if(set.size() == 2){
                StringBuilder sb = new StringBuilder();
                for(char c : set){
                    sb.append(c);
                }
                answer.add(sb.toString());
            }
        }

        //대각선확인
        HashSet<Character> set = new HashSet<>();
        set.add(arr[0][0]);
        set.add(arr[1][1]);
        set.add(arr[2][2]);

        if(set.size() == 2){
            StringBuilder sb = new StringBuilder();
            for(char c : set){
                sb.append(c);
            }
            answer.add(sb.toString());
        }

        //arr[2][0], arr[1][1], arr[0][2]
        set = new HashSet<>();
        set.add(arr[2][0]);
        set.add(arr[1][1]);
        set.add(arr[0][2]);

        if(set.size() == 2){
            StringBuilder sb = new StringBuilder();
            for(char c : set){
                sb.append(c);
            }
            answer.add(sb.toString());
        }

        System.out.println(answer.size());
    }
}