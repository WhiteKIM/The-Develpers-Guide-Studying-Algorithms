package baekjoon.badook.OxO3;

import java.util.Scanner;

public class p1475 {

    // 9 to 6
    // 6 to 9
    public static int convert(String N, int[] data) {
        int result6 = Integer.MAX_VALUE;

        String N6 = N;
        for(int i = 0; i < data[6]; i++) {
            int[] map = new int[10];
            N6 = N6.replaceFirst("6", "9");
            for(int j = 0; j < N6.length(); j++) {
                int num = Character.getNumericValue(N6.charAt(j));
                map[num] +=1;
            }

            int num = 0;
            for(int j = 0; j < 10; j++) {
                if(num < map[j]) {
                    num = map[j];
                }
            }
            result6 = Math.min(result6, num);
        }


        String N9 = N;
        int result9 = Integer.MAX_VALUE;
        for(int i = 0; i < data[9]; i++) {
            int[] map = new int[10];
            N9 = N9.replaceFirst("9", "6");
            for(int j = 0; j < N9.length(); j++) {
                int num = Character.getNumericValue(N9.charAt(j));
                map[num] +=1;
            }

            int num = 0;
            for(int j = 0; j < 10; j++) {
                if(num < map[j]) {
                    num = map[j];
                }
            }
            result9 = Math.min(result9, num);
        }

        return Math.min(result6, result9);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        int[] data = new int[10];
        for(int i = 0; i < N.length(); i++) {
            int num = Character.getNumericValue(N.charAt(i));
            data[num] +=1;
        }

        int result = 0;
        for(int i = 0; i < 10; i++) {
            result = Math.max(result, data[i]);
        }

        result = Math.min(result, convert(N, data));
        System.out.println(result);
    }
}
