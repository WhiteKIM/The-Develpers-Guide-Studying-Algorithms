package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class p4948 {
    public static int[] check = new int[300000];

    public static void main(String[] args) {
        Arrays.fill(check, 1);
        check[0] = 0;
        check[1] = 0;
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (true) {
            int num = sc.nextInt();
            if(num == 0) {
                break;
            }

            if(num == 1) {
                sb.append(1).append("\n");
                continue;
            }

            for(int i = 0; (i * i) <= (num * 2); i++) {
                if(check[i] == 1) {
                    for(int j = i * i; j <= (num * 2); j+=i) {
                        check[j] = 0;
                    }
                }
            }

            int count = 0;
            for(int i = num + 1; i <= num * 2; i++) {
                if(check[i] == 1) {
                    count+=1;
                }
            }

            sb.append(count).append("\n");
        }

        System.out.println(sb.toString());
    }
}
