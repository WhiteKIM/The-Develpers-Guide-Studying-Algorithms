package baekjoon.badook.OxO6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p18258 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int T;
        T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        MyQueue myQueue = new MyQueue();

        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");

            if (input[0].equals("push")) {
                myQueue.add(Integer.parseInt(input[1]));
            } else if (input[0].equals("pop")) {
                if (myQueue.isEmpty())
                    sb.append(-1).append("\n");
                else
                    sb.append(myQueue.pop()).append("\n");
            } else if (input[0].equals("size")) {
                sb.append(myQueue.size()).append("\n");
            } else if (input[0].equals("empty")) {
                if (myQueue.isEmpty())
                    sb.append(1).append("\n");
                else
                    sb.append(0).append("\n");
            } else if (input[0].equals("front")) {
                if (myQueue.isEmpty())
                    sb.append(-1).append("\n");
                else {
                    sb.append(myQueue.front()).append("\n");
                }
            } else if (input[0].equals("back")) {
                if (myQueue.isEmpty())
                    sb.append(-1).append("\n");
                else {
                    sb.append(myQueue.back()).append("\n");
                }
            }
        }
        System.out.println(sb.toString());
    }

    /**
     * 나만의 큐 구현
     * */
    static public class MyQueue {
        private int rear;//가장 앞쪽을 가르키는 포인터
        private int back;//가장 뒤쪽을 가르키는 포인터
        private int[] data = new int[2000000];

        // 생성자 함수
        public MyQueue() {
            this.rear = 0;
            this.back = -1;
        }

        public void add(int num) {
            data[++back] = num;
        }

        // back == rear가 같으면 데이터가 하나 있는 경우
        // 따라서 크기는 back - rear + 1을 통해 구할 수 있음
        public int size() {
            return this.back - this.rear + 1;
        }

        // 앞쪽을 가르키는 포인터가 뒤쪽 포인터를 앞지르면 큐는 비었음
        public boolean isEmpty() {
            if (this.back < this.rear)
                return true;
            else
                return false;
        }

        public int pop() {
            int num = data[rear];
            rear++;
            return num;
        }

        public int front() {
            return data[rear];
        }

        public int back() {
            return data[back];
        }
    }
}

// 시간 초과가 발생합니다
/**
 * if(input[0].equals("push")) {
 * queue.add(Integer.parseInt(input[1]));
 * } else if(input[0].equals("pop")) {
 * if(queue.isEmpty())
 * sb.append(-1).append("\n");
 * else
 * sb.append(queue.poll()).append("\n");
 * } else if(input[0].equals("size")) {
 * sb.append(queue.size()).append("\n");
 * } else if (input[0].equals("empty")) {
 * if(queue.isEmpty())
 * sb.append(1).append("\n");
 * else
 * sb.append(0).append("\n");
 * } else if (input[0].equals("front")) {
 * if(queue.isEmpty())
 * sb.append(-1).append("\n");
 * else {
 * sb.append(queue.peek()).append("\n");
 * }
 * } else if(input[0].equals("back")) {
 * if(queue.isEmpty())
 * sb.append(-1).append("\n");
 * else {
 * sb.append(queue).append("\n");
 * }
 * }
 */