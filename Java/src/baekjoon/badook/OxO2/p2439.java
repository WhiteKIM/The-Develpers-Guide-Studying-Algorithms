package baekjoon.badook.OxO2;

import java.util.Scanner;

public class p2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= N; j++) {
                if(N - i < j) {
                    sb.append("*");
                } else {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
