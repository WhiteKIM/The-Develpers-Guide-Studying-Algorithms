package baekjoon.badook.OxO3;

import java.util.Scanner;

public class p1919 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int[] alphabet1 = new int[26];
        int[] alphabet2 = new int[26];

        String a = sc.nextLine();
        String b = sc.nextLine();

        for(int j = 0; j < a.length(); j++) {
            int val = (int) a.charAt(j) - 'a';
            alphabet1[val] += 1;
        }

        for(int j = 0; j < b.length(); j++) {
            int val = (int) b.charAt(j) - 'a';
            alphabet2[val] += 1;
        }

        for(int j = 0; j < 26; j++) {
            if(alphabet1[j] == alphabet2[j]) {
                alphabet1[j] = 0;
                alphabet2[j] = 0;
            }
        }

        for(int i = 0; i < 26; i++) {
            count += Math.abs(alphabet1[i] - alphabet2[i]);//서로 다른 개수인 경우도 반영
        }

        System.out.println(count);
    }
}
