package baekjoon.badook.OxO6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p2164 {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= N; i++) {
            queue.add(i);
        }

        while (queue.size() > 1) {
            int remove = queue.poll();
            int num = queue.poll();
            queue.add(num);
        }

        System.out.println(queue.peek());
    }
}
