package baekjoon.badook.OxO5;

import java.util.Scanner;
import java.util.Stack;

public class p17298 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        long[] data = new long[N];
        Stack<Integer> stack = new Stack<>();
        String[] input = sc.nextLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            data[i] = Long.parseLong(input[i]);
        }

        for(int i = 0; i < N; i++) {
            // 값 비교는 마지막 인덱스 위치의 배열값보다 현재 입력값이 더 큰지
            while (!stack.isEmpty() && data[stack.peek()] < data[i]) {
                data[stack.pop()] = data[i];//배열의 값을 자신과 가장 가까운 오른쪽의 최대값으로 변경
            }
            stack.push(i);//스택엔 인덱스가 들어간다.
        }

        while (!stack.isEmpty())
            data[stack.pop()] = -1;//스택에 남은 인덱스는 최대값을 만나지 못한 배열의 위치

        for(long i : data)
            sb.append(i).append(" ");

        System.out.println(sb.toString());
    }
}
