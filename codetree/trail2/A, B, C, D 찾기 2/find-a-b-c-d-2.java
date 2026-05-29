import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < 15 ; i++){
            list.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(list);

        for(int a = 1 ; a <= 10 ; a++){
            for(int b = a ; b <= 10 ; b++){
                for(int c = b ; c <= 10 ; c++){
                    for(int d = c ; d <= 10 ; d++){
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(a);
                        temp.add(b);
                        temp.add(c);
                        temp.add(d);

                        temp.add(a + b);
                        temp.add(a + c);
                        temp.add(a + d);
                        temp.add(b + c);
                        temp.add(b + d);
                        temp.add(c + d);

                        temp.add(a + b + c);
                        temp.add(a + b + d);
                        temp.add(a + c + d);
                        temp.add(b + c + d);
                        
                        temp.add(a + b + c + d);

                        Collections.sort(temp);

                        boolean isTrue = true;
                        for(int i = 0 ; i < 15; i++){
                            if(list.get(i) != temp.get(i)){
                                isTrue = false;
                                break;
                            }
                            
                        }
                        if(isTrue){
                            System.out.println(a + " " + b + " " + c + " " + d);
                        }
                    }
                }
            }
        }
    }
}