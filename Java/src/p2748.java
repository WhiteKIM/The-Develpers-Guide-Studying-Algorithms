import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class p2748 {
    private static ArrayList<BigInteger> arrayList;
    public static BigInteger bigInteger1;
    public static BigInteger bigInteger2;

    public static BigInteger fibo(int N) {
        arrayList.add(BigInteger.valueOf(0));
        arrayList.add(BigInteger.valueOf(1));
        arrayList.add(BigInteger.valueOf(1));

        for(int i = 3; i <= N; i++) {
            bigInteger1 = arrayList.get(i-1);
            bigInteger2 = arrayList.get(i-2);
            arrayList.add(bigInteger1.add(bigInteger2));
        }
        return arrayList.get(N);
    }

    public static void main(String[] args) {
        int N;
        arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        BigInteger bigInteger = fibo(N);
        System.out.println(bigInteger.toString());
    }
}
