package baekjoon.badook.OxO2;

import java.util.Scanner;

public class p2490 {
    public static void main(String[] args) {
        // 0은 윷이 뒤집힌 형태
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++) {
            int front = 0;//안뒤집힘
            int back = 0;//뒤집힘

            String[] input = sc.nextLine().split(" ");
            for(int j = 0; j < input.length; j++) {
                if(Integer.parseInt(input[j]) == 0) {
                    back+=1;
                } else {
                    front+=1;
                }
            }

            if(back == 1) {
                System.out.println("A");
            } else if(back == 2) {
                System.out.println("B");
            } else if(back == 3) {
                System.out.println("C");
            } else if(back == 4) {
                System.out.println("D");
            } else {
                System.out.println("E");
            }
        }
    }
}
