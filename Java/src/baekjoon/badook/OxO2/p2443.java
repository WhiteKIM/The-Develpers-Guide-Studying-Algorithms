package baekjoon.badook.OxO2;

import java.util.Scanner;

public class p2443 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        for(int i = 1; i <= N; i++) {
            for(int j = 0; j < N - i; j++) {
                sb.append(" ");
            }
            for(int j = 0; j < 2 * i -1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        for(int i = N - 1; i >= 1; i--) {
            for(int j = N -i; j > 0; j--) {
                sb.append(" ");
            }
            for(int j = 2 * i -1; j > 0; j--) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
