package baekjoon.badook.OxO2;

import java.util.Scanner;

public class p2446 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        int left = 0;
        int right = 2 * N;
        for(int i = 1; i <= N; i++) {
            //레프트 먼저
            for(int k = 0; k < left; k++)
                sb.append(" ");

            left+=1;

            for(int k = left; k < right; k++)
                sb.append("*");

            right-=1;
            sb.append("\n");
        }
        left-=1;
        right+=1;
        for(int i = N; i > 1; i--) {
            left-=1;
            //레프트 먼저
            for(int k = 0; k < left; k++)
                sb.append(" ");

            for(int k = left; k < right; k++)
                sb.append("*");

            right+=1;

            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
