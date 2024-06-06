import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class p20300 {
    public static long max = Long.MIN_VALUE;

    public static void solved(long[] data) {
        if((data.length % 2)==1) {
//            max = Math.max(max, data[data.length-1]);
            int index = data.length - 2;
            for(int i = 0; i < data.length/2; i++) {
                int index1 = index - i;
                max = Math.max(max, data[i]+data[index1]);
            }
        } else {
            int index = data.length -1;
            for(int i = 0; i < data.length/2; i++) {
                int index1 = index - i;
                max = Math.max(max, data[i]+data[index1]);
            }
        }
    }

    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());
        String[] input = sc.nextLine().split(" ");
        long[] data = new long[N];
        for(int i = 0; i < input.length; i++) {
            data[i] = Long.parseUnsignedLong(input[i]);
        }

        Arrays.sort(data);
        solved(data);
        System.out.println(max);
    }
}
