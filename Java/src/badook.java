import java.util.Map;
import java.util.Scanner;

public class badook {

    public static int IsSqrt(int N) {
        int max = 0;
        for(int i = 2; i <= N; i*=2) {
            max = Math.max(max, i);
        }

        return max;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(IsSqrt(N));
    }
}
