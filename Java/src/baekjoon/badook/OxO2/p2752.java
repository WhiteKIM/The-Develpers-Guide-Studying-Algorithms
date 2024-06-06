package baekjoon.badook.OxO2;

import java.util.Arrays;
import java.util.Scanner;

public class p2752 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] data = new int[3];
        for(int i = 0; i < 3; i++) {
            data[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(data);
        for(int i : data) {
            System.out.print(i+" ");
        }
    }
}
