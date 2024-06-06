package baekjoon.badook.Ox10;

import java.util.Scanner;

public class p9095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();

        for(int i = 0; i < N; i++) {
            int num = sc.nextInt();
            int solved = solved(num);
            sb.append(solved).append("\n");
        }

        System.out.println(sb.toString());
    }

    private static int solved(int num) {
        int[] data = new int[12];
        data[1] = 1;
        data[2] = 2;
        data[3] = 4;

        for(int i = 4; i <= 11; i++) {
            data[i] = data[i-3] + data[i-2] + data[i-1];
        }

        return data[num];
    }
}
