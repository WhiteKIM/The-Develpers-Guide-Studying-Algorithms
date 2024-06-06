package baekjoon.badook.OxO2;

import java.util.Scanner;

public class p10804 {

    public static void reverse(int A, int B, int[] data) {
        while (A < B) {
            int temp = data[B];
            data[B]= data[A];
            data[A] = temp;
            A++;
            B--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] data = new int[21];
        for(int i = 1; i <= 20; i++) {
            data[i] = i;
        }

        for(int i = 0; i < 10; i++) {
            String[] input = sc.nextLine().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            reverse(A, B, data);
        }

        for(int i = 1; i <= 20; i++) {
            System.out.print(data[i]+" ");
        }
    }
}
