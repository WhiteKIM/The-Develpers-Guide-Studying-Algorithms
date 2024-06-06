package baekjoon.badook.OxOC;

import java.util.Scanner;

/**
 * 바킹독 OxOc
 */
public class p15649 {
    public static int[] check = new int[10];
    public static int[] data = new int[10];
    public static int N, M;
    public static void backTracking(int K) {
        if(K == M) {
            for(int i = 0; i < M; i++) {
                System.out.print(data[i]+" ");
            }
            System.out.println();
            return;
        }

        for(int i = 1; i <= N; i++) {
            if(check[i] == 0) {
                data[K] = i;
                check[i] = 1;
                backTracking(K+1);
                check[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        backTracking(0);
    }
}
