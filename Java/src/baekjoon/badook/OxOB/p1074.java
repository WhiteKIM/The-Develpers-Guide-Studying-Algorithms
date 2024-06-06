package baekjoon.badook.OxOB;

import java.util.Scanner;

public class p1074 {
    public static int N, r, c;
    public static int count = 0;

    public static void recursive(int x, int y, int size) {
        if(size == 1) {
            return;
        }

        if(x < size / 2 &&  y  < size / 2) {
            recursive(x, y, size / 2);
        } else if (x < size / 2 &&  y  >= size / 2) {
            count += ((size * size)/4);
            recursive(x, y - size / 2, size / 2);
        } else if(x >= size / 2 &&  y  < size / 2) {
            count += ((size * size)/4) * 2;
            recursive(x - size / 2, y, size / 2);
        } else {
            count += ((size * size)/4) * 3;
            recursive(x - size / 2, y - size / 2, size / 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        N = Integer.parseInt(input[0]);
        r = Integer.parseInt(input[1]);
        c = Integer.parseInt(input[2]);

        recursive(r, c, (int) Math.pow(2, N));
        System.out.println(count);
    }
}
