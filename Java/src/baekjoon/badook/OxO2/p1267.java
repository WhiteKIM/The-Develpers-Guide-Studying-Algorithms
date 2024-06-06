package baekjoon.badook.OxO2;

import java.util.Scanner;

public class p1267 {

    public static int youngsik(int[] data) {
        int result = 0;

        for (int val : data) {
            int count = val / 30;
            result += 10 * (count+1);
        }

        return result;
    }

    public static int minsik(int[] data) {
        int result = 0;

        for (int val : data) {
            int count = val / 60;
            result += 15 * (count+1);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int[] data = new int[N];
        String[] input = sc.nextLine().split(" ");

        for(int j = 0; j < N; j++) {
            data[j] = Integer.parseInt(input[j]);
        }

        if(youngsik(data) < minsik(data)) {
            System.out.println("Y "+youngsik(data));
        } else if(minsik(data) < youngsik(data)) {
            System.out.println("M "+minsik(data));
        } else {
            System.out.println("Y M "+youngsik(data));
        }
    }
}
