package baekjoon.badook.OxO3;

import java.util.Scanner;

public class p11328 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < N; i++) {
            int[] alphabet1 = new int[26];
            int[] alphabet2 = new int[26];

            String[] input = sc.nextLine().split(" ");
            String a = input[0];
            String b = input[1];

            if(a.length() != b.length()) {
                System.out.println("Impossible");
                continue;
            }

            for(int j = 0; j < a.length(); j++) {
                int val = (int) a.charAt(j) - 'a';
                alphabet1[val] += 1;
            }

            for(int j = 0; j < b.length(); j++) {
                int val = (int) b.charAt(j) - 'a';
                alphabet2[val] += 1;
            }

            boolean check = true;
            for(int j = 0; j < 26; j++) {
                if(alphabet1[j] != alphabet2[j]) {
                    check = false;
                }
            }

            if(check) {
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
        }
    }
}
