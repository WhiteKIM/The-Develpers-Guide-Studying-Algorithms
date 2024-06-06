package baekjoon;

import java.util.Scanner;

public class p28444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H, I, A, R, C;
        String[] input = sc.nextLine().split(" ");
        H = Integer.parseInt(input[0]);
        I = Integer.parseInt(input[1]);
        A = Integer.parseInt(input[2]);
        R = Integer.parseInt(input[3]);
        C = Integer.parseInt(input[4]);

        int result = (H * I) - (A * R * C);
        System.out.println(result);
    }
}
