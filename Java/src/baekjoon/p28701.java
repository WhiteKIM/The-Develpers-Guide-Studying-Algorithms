package baekjoon;

import java.util.Scanner;

public class p28701 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        for(int i = 1; i <= N; i++) {
            sum1 += i;
        }

        sum2 = (int) Math.pow(sum1, 2);

        for(int i = 1; i <= N; i++) {
            sum3 += (int) Math.pow(i, 3);
        }

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}
