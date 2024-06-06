package baekjoon.badook.OxO8;

import java.util.Scanner;
import java.util.Stack;

public class p10799 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.nextLine().toCharArray();
        int count = 0;
        Stack<Character> stack = new Stack<>();

        //스택에는 '('만 들어간다.
        for(int i = 0; i < input.length; i++) {
            char c = input[i];
            if(c == '(') {
                stack.push(c);
            } else {
                if(input[i-1]=='(') {//스택의 개수는 쇠막대기의 개수
                    stack.pop();
                    count += stack.size();
                } else {//쇠막대의 끝부분
                    stack.pop();
                    count+=1;
                }
            }
        }

        System.out.println(count);
    }
}
