package baekjoon.badook.OxO6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class p10845 {
    public static void main(String[] args) throws IOException {
        int N;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        MyQueue queue = new MyQueue();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");

            if(input[0].equals("push")) {
                int num = Integer.parseInt(input[1]);
                queue.push(num);
            } else if(input[0].equals("pop")) {
                sb.append(queue.pop()).append("\n");
            } else if(input[0].equals("size")) {
                sb.append(queue.size()).append("\n");
            } else if(input[0].equals("empty")) {
                sb.append(queue.empty()).append("\n");
            } else if(input[0].equals("front")) {
                sb.append(queue.front()).append("\n");
            } else {
                sb.append(queue.back()).append("\n");
            }
        }
        System.out.println(sb.toString());
    }

    public static class MyQueue {
        private int front;
        private int rear;
        private int[] queue;

        public MyQueue() {
            this.front = 0;
            this.rear = 0;
            this.queue = new int[10000];
        }

        public void push(int x) {
            queue[rear] = x;
            rear+=1;
        }

        public int pop() {
            if(rear!=front)
                return queue[front++];
            else
                return -1;
        }

        public int size() {
            return rear - front;
        }

        public int empty() {
            if(front == rear)
                return 1;
            else
                return 0;
        }

        public int front() {
            if(front != rear)
                return queue[front];
            else
                return -1;
        }

        public int back() {
            if(front != rear)
                return queue[rear-1];
            else
                return -1;
        }
    }
}
