import java.util.Arrays;
import java.util.Scanner;

public class p1699 {

    public static int solved(int N) {
        int[] data = new int[N+1];
        for(int i = 1; i < N+1; i++)
            data[i] = i;


        for(int i = 2; i < N+1; i++) {
            for(int j = 1; (j * j) <= i; j++) {
                data[i] = Math.min(data[i], data[i -(j * j)] +1);
            }
        }
        return data[N];
    }

    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());

        System.out.println(solved(N));
    }
}
