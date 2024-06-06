package baekjoon.badook.OxO3;

import java.util.Scanner;

public class p13300 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int size = Integer.parseInt(input[1]);
        int[][] students = new int[7][2];

        for(int i = 0; i < N; i++) {
            input = sc.nextLine().split(" ");
            int S = Integer.parseInt(input[0]);
            int grade = Integer.parseInt(input[1]);
            students[grade][S] +=1;
        }

        int count = 0;

        for(int[] student : students) {
            for(int x : student) {
                if(x != 0) {
                    if(x <= size) {
                        count += 1;
                    } else {
                        if(x % size == 0) {
                            count += x / size;
                        } else {
                            count += x / size + 1;
                        }
                    }
                }
            }
        }

        System.out.println(count);
    }
}
