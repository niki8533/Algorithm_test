import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++){
            int c = Integer.parseInt(br.readLine());

            int q = c / 25;
            c %= 25;

            int d = c / 10;
            c %= 10;

            int n = c / 5;
            c %= 5;

            sb.append(q + " " + d + " " + n + " " + c ).append("\n");
        }

        System.out.println(sb);
    }
}
