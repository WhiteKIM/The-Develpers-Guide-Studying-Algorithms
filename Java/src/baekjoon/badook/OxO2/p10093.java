package baekjoon.badook.OxO2;

import java.util.Scanner;

public class p10093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long count = 0;
        if(A > B) {
            count = A - B - 1;
            System.out.println(count);
            for(long i = B+1; i < A; i++) {
                System.out.print(i+" ");
            }
        } else if(B > A){
            count = B - A - 1;
            System.out.println(count);
            for(long i = A+1; i < B; i++) {
                System.out.print(i+" ");
            }
        } else {
            System.out.println(0);
        }
    }
}
