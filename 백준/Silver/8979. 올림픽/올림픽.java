import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        ArrayList<Medal> list = new ArrayList<>();

        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            int country = Integer.parseInt(st.nextToken());
            int gold = Integer.parseInt(st.nextToken());
            int silver = Integer.parseInt(st.nextToken());
            int bronze = Integer.parseInt(st.nextToken());

            list.add(new Medal(country, gold, silver, bronze));
        }

        Collections.sort(list, new Comparator<Medal>() {
            @Override
            public int compare(Medal o1, Medal o2) {
                if(o1.gold == o2.gold){
                    if(o1.silver == o2.silver){
                        return o2.bronze - o1.bronze;
                    }
                    return o2.silver - o1.silver;
                }
                return o2.gold - o2.gold;
            }
        });

        for(Medal medal : list){
            if(medal.country == K){
                System.out.println(list.indexOf(medal));
                break;
            }
        }
    }
}

class Medal {
    int country;
    int gold;
    int silver;
    int bronze;

    public Medal(int country, int gold, int silver, int bronze){
        this.country = country;
        this.gold = gold;
        this.silver = silver;
        this.bronze = bronze;
    }
}
