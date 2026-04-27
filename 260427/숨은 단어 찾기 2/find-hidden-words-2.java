import java.util.Scanner;
public class Main {
    static int[] dx = {1, -1, 0, 0, 1, 1, -1, -1};
    static int[] dy = {0, 0, 1, -1, 1, -1, 1, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[][] arr = new String[n][m];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().split("");
        }

        // Please write your code here.
        int count = 1;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                //if(!arr[i][j].equals("L") || !arr[i][j].equals("E")) continue;

                for(int d = 0 ; d < 8 ; d++){
                    StringBuilder sb = new StringBuilder();
                    int x = i;
                    int y = j;

                    for(int k = 0 ; k < 3 ; k++){
                        int nx = x + dx[d];
                        int ny = y + dy[d];

                        if(nx >= 0 && nx < n && ny >= 0 && ny < m){
                            sb.append(arr[nx][ny]);
                            x = nx;
                            y = ny;
                        }
                    }

                    if(sb.toString().equals("LEE") || sb.toString().equals("EEL")){
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}