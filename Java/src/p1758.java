import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class p1758 {
    public static void main(String[] args) {
        int T;
        Scanner sc = new Scanner(System.in);
        T = Integer.parseInt(sc.nextLine());
        int[] data = new int[T];

        for(int i = 0; i < T; i++) {
            data[i] = Integer.parseInt(sc.nextLine());
        }
        Arrays.sort(data);
        int rank = 1;
        BigInteger sum = new BigInteger("0");
        for(int i = T-1; i >= 0; i--) {
            if((data[i] - (rank -1)) > 0) {
                BigInteger num = BigInteger.valueOf(data[i] - (rank -1));
                sum = sum.add(num);
            }
            rank++;
        }

        System.out.println(sum.toString());
    }
}
