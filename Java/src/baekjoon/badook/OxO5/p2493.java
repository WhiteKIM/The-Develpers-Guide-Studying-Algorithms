package baekjoon.badook.OxO5;

import java.util.Scanner;
import java.util.Stack;

public class p2493 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String[] input = sc.nextLine().split(" ");
        Stack<int[]> stack = new Stack<>();
        int[] result = new int[N];
        for(int i = N-1; i >= 0; i--) {
            int val = Integer.parseInt(input[i]);
            if(stack.isEmpty()) {
                stack.add(new int[] {val, i});
            } else {
                while(stack.peek()[0] < val) {
                    result[stack.peek()[1]] = i+1;//현재 들어온 값의 인덱스
                    stack.pop();
                    if(stack.isEmpty())
                        break;
                }
                stack.add(new int[] {val, i});
            }
        }

        for(int i : result)
            System.out.print(i+" ");
    }
}
