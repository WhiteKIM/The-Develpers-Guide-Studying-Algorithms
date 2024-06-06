package baekjoon.badook.OxO3;

import java.util.Scanner;

public class p10808 {
    public static int[] result = new int[26];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.nextLine().toCharArray();
        int a = 'a';

        for(int i = 0; i < input.length; i++) {
            int index = input[i];
            index = index - a;
            result[index]++;
        }

        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
