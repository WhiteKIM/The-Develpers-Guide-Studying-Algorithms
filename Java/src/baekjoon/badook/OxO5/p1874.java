package baekjoon.badook.OxO5;

import java.util.Scanner;
import java.util.Stack;

//Do it 알고리즘
public class p1874 {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        N = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int num = 1;
        boolean check = true;
        for(int i = 0; i < arr.length; i++) {
            int comp = arr[i];

            if(comp >= num) {
                while (comp >= num) {//현재 값보다 스택에 저장한 값이 작다면 값을 추가
                    stack.push(num++);
                    sb.append("+").append("\n");
                }
                stack.pop();//목표값을 pop
                sb.append("-").append("\n");
            } else {
                int num2 = stack.pop();
                if(num2 > comp) {
                    System.out.println("NO");
                    check = false;
                    break;
                } else {
                    sb.append("-").append("\n");
                }
            }
        }

        if(check)
            System.out.println(sb.toString());
    }
}
