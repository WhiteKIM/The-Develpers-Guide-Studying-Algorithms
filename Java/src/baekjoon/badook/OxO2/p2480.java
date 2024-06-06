package baekjoon.badook.OxO2;

import java.util.Scanner;

public class p2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] data = new int[7];
        String[] input = sc.nextLine().split(" ");
        for(int i = 0; i < input.length; i++) {
            int value = Integer.parseInt(input[i]);
            data[value] += 1;
        }

        int price = 0;
        int index = 0;
        boolean check = false;
        for(int j = 3; j > 0; j--) {
            if(check)
                break;
            for(int i = 1; i <= 6; i++) {
                if(j == 3) {
                    if(data[i] == j) {
                        price = 10000 + (i * 1000);
                        check = true;
                        break;
                    }
                } else if(j == 2) {
                    if(data[i] == j) {
                        price = 1000 + (i * 100);
                        check = true;
                        break;
                    }
                } else {
                    if(data[i] == j && i > index) {
                        index = i;
                    }
                }
            }
        }

        if(price == 0) {
            price = index * 100;
        }

        System.out.println(price);
    }
}
