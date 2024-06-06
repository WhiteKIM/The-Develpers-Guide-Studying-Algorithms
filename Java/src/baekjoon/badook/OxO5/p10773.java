package baekjoon.badook.OxO5;

import java.util.Scanner;
import java.util.Stack;

public class p10773 {
    public static void main(String[] args) {
        int N;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if(num != 0) {
                stack.push(num);
            }
            else
                stack.pop();
        }
        while(!stack.isEmpty()) {
            sum+= stack.pop();
        }

        System.out.println(sum);
    }
}
