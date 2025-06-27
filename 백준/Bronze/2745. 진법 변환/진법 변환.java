import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        int answer = 0;
        int temp = 1;

         for(int i = N.length() - 1 ; i >= 0 ; i--){
            char c = N.charAt(i);
            if(c >= 'A' && c <= 'Z') {
                answer = answer + (c - 55) * temp;
            }
            else
                answer = answer + (c - 48) * temp;
            temp *= B;
        }

        System.out.println(answer);
    }
}
