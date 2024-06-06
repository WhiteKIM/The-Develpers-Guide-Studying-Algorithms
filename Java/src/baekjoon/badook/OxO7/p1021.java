package baekjoon.badook.OxO7;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

public class p1021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        Deque<Integer> deque = new ArrayDeque<>();
        input = sc.nextLine().split(" ");

        for(int i = 1; i <= N; i++)
            deque.add(i);

        int count = 0;

        for(String str :  input) {
            int val = Integer.parseInt(str);
            Iterator<Integer> iterator = deque.iterator();
            int target = 0;
            while (iterator.hasNext()) {
                if(iterator.next() == val)
                    break;
                target+=1;
            }

            if(target <= deque.size()/2) {
                while (deque.peek() != val) {
                    deque.addLast(deque.pollFirst());
                    count+=1;
                }
                deque.poll();
            } else {
                while (deque.peek() != val) {
                    deque.addFirst(deque.pollLast());
                    count+=1;
                }
                deque.poll();
            }
        }
        System.out.println(count);
    }
}
