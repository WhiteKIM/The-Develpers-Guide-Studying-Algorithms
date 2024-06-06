package baekjoon.arena;

import java.io.*;
import java.util.Scanner;

public class G1084_B {

    // 피타고라스의 정의
    // a^2 + b^2 = c^2
    // 치환하면 a^2 + b^2 - c^2 = 0
    // 그러면 피타고라스의 정의에 따라 0이 되는 모든 경우를 찾는다?
    public static void main(String[] args) throws IOException {
        long N;
        Scanner sc = new Scanner(System.in);
        N = Long.parseLong(sc.nextLine());
        int count = 0;
        if(N == 1) {
            System.out.println(-1);
            return;
        }
        for(int a = 1; a <= Math.sqrt(N); a++) {
            for(int b = 1; b <= Math.sqrt(N); b++) {
                if((a*a)+(b*b)-N == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
