import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Student> list = new ArrayList<>();

        for(int i = 0 ; i < n ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int day = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());

            list.add(new Student(name, day, month, year));
        }

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.year == o2.year){
                    if(o1.month == o2.month){
                        return o2.day - o1.day;
                    }
                    return o2.month - o1.month;
                }
                return o2.year - o1.year;
            }
        });

        System.out.println(list.get(0).name);
        System.out.println(list.get(n-1).name);
    }
}

class Student {
    String name;
    int day;
    int month;
    int year;

    public Student(String name, int day, int month, int year){
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
    }

}
