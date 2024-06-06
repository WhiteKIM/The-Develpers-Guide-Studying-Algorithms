package baekjoon.badook.OxOB;

import java.util.Scanner;

public class p1629 {
    public static int result = 0;
    public static long A, B, C;

    public static long recursive(long a, long b, long c) {
        if(b == 0) {
            return 1;
        }

        long num = recursive(a, b/2, c);
        if(b % 2 == 0) {
            return (num * num) % c;
        } else {
            return (((num * num) % c) * A) % c ;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        A = Long.parseLong(input[0]);
        B = Long.parseLong(input[1]);
        C = Long.parseLong(input[2]);

        System.out.println(recursive(A, B, C));
    }
}
