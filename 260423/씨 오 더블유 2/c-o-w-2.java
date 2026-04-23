import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        
        int c = 0;
        int o = 0;
        int w = 0;

        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);

            if(ch == 'C'){
                c++;
            } else if(ch == 'O'){
                o++;
            } else if(ch == 'W'){
                w++;
            }
        }

        int answer = c*o*w;
        System.out.println(answer);
    }
}