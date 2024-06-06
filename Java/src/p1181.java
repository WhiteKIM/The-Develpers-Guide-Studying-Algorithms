import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p1181 {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());
        ArrayList<String> data = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            data.add(sc.nextLine());
        }
        data = new ArrayList<String>(data.stream().distinct().collect(Collectors.toList()));
        Collections.sort(data, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() != o2.length())
                    return Integer.compare(o1.length(), o2.length());
                else
                    return o1.compareTo(o2);
            }
        });

        for(String s : data) {
            System.out.println(s);
        }
    }
}
