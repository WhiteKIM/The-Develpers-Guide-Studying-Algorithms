import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class p10815 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        Set<Integer> sangun = new LinkedHashSet<>();
        String[] input = sc.nextLine().split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            sangun.add(Integer.parseInt(input[i]));
        }

        int M = Integer.parseInt(sc.nextLine());
        Set<Integer> data = new LinkedHashSet<>();
        input = sc.nextLine().split(" ");

        for(int i = 0; i < M; i++) {
            data.add(Integer.parseInt(input[i]));
        }

        for(int i : data) {
            if(sangun.contains(i)) {
                sb.append(1).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}
