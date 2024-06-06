package baekjoon.badook.OxO2;

import java.util.Scanner;

public class p2753 {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        if(N % 400== 0) {
            System.out.println("1");
        } else {
            if(N % 100 != 0 && N % 4 == 0) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}
