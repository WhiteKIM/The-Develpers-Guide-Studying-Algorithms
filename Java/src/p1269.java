import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p1269 {
    public static void main(String[] args) {
        int N, M;
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();

        input = sc.nextLine().split(" ");
        for(int i = 0; i < N; i++) {
            A.add(Integer.parseInt(input[i]));
        }

        input = sc.nextLine().split(" ");
        for(int i = 0; i < M; i++) {
            B.add(Integer.parseInt(input[i]));
        }

        // A - B
        int count = 0;
        for(int b_num : B) {
            if(!A.contains(b_num))
                count+=1;
        }

        for(int a_num : A) {
            if(!B.contains(a_num))
                count+=1;
        }

        System.out.println(count);
    }
}
