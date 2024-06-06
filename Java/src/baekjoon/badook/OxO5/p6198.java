package baekjoon.badook.OxO5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class p6198 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Long[] data = new Long[N];
        Stack<Long> stack = new Stack<>();
        for(int i = 0; i < N; i++)
            data[i] = Long.parseLong(br.readLine());

        long count = 0;
        for(long i : data) {
            if(stack.isEmpty())
                stack.add(i);
            else {
                while (stack.peek() <= i) {//현재 최상단 값이 입력값보다 같거나 작다면, 값읋 제거
                    stack.pop();
                    if(stack.isEmpty())
                        break;
                }
                stack.add(i);//현재 스택 값이 1이면, 확인가능한 정원 X
                // 최상단의 정원은 스택의 다른 빌딩에서 확인가능한 정원이다.
                count += stack.size() - 1;
            }
        }

        System.out.println(count);
    }
}
