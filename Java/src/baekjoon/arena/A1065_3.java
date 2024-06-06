package baekjoon.arena;

import java.util.Scanner;

public class A1065_3 {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < N; i++) {
            int M;
            M = Integer.parseInt(sc.nextLine());
            int[] input = new int[M];
            String[] str = sc.nextLine().split(" ");
            for(int j = 0; j < str.length; j++) {
                input[j] = Integer.parseInt(str[j]);
            }

            if(solved(input)) {
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }
        }

        System.out.println(sb.toString());
    }

    private static boolean solved(int[] input) {
        int plus_count = 0;
        int minus_count = 0;

        int start = 0;
        int end = 0;

        for(int i = 0; i < input.length; i++) {
            for(int j = i+1; j < input.length; j++) {
                if(input[i] > 0) {
                    plus_count++;
                    if(input[j] > 0) {
                        break;
                    } else {
                        if(input[i]+input[j] > 0) {
                            i = j;
                            break;
                        } else {
                            break;
                        }
                    }
                } else {
                    if(input[i]+input[j] < 0 && input[j] > 0) {
                        minus_count++;
                        break;
                    } else if(input[i]+input[j] > 0){
                        break;
                    }
                }
            }
        }

        System.out.println("plus : "+plus_count);
        System.out.println("minus : "+minus_count);

        if(plus_count > minus_count) {
            return true;
        } else {
            return false;
        }
    }
}
