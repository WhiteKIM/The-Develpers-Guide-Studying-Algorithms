package baekjoon.badook.OxO2;

import java.util.Arrays;
import java.util.Scanner;

public class p2587 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = 0;
        int[] data = new int[5];
        int avg = 0;
        while (index < 5) {
            int val = sc.nextInt();
            data[index++] = val;
            avg += val;
        }
        avg = avg / 5;
        System.out.println(avg);
        Arrays.sort(data);
        System.out.println(data[2]);
    }
}
