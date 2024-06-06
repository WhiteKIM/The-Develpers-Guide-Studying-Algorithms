package baekjoon;

import java.util.Scanner;

public class p10869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int plus = N + M;
        int minus = N - M;
        int multiply = N * M;
        int division = N / M;
        int mod = N % M;

        System.out.println(plus);
        System.out.println(minus);
        System.out.println(multiply);
        System.out.println(division);
        System.out.println(mod);
    }
}
