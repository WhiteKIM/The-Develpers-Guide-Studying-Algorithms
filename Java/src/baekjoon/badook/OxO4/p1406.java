package baekjoon.badook.OxO4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class p1406 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String data;
        data = br.readLine();
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
//        MyQueue myQueue = new MyQueue(data);
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for(int i = 0; i < data.length(); i++) {
            stack1.push(data.charAt(i));
        }

        for(int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            String command = input[0];
            switch (command) {//스택 두 개를 이용해서 커서를 기록한다.
                case "L":
                    if(!stack1.isEmpty())//비었다면 커서는 맨 앞
                        stack2.push(stack1.pop());
                    break;
                case "D":
                    if(!stack2.isEmpty())// 비엇다면 문장의 맨뒤
                        stack1.push(stack2.pop());
                    break;
                case "B":
                    if(!stack1.isEmpty())
                        stack1.pop();
                    break;
                case "P" :
                    String value = input[1];
                    stack1.push(value.charAt(0));
                    break;
                default:
            }
        }

        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        while (!stack2.isEmpty()) {
            sb.append(stack2.pop());
        }

        System.out.println(sb.toString());
    }

//    public static class MyQueue {
//        List<Character> data = new ArrayList<>();
//        int cursor = -1;
//
//        public MyQueue(String data) {
//            for(int i = 0; i < data.length(); i++) {
//                this.data.add(data.charAt(i));
//            }
//            this.cursor = data.length();
//        }
//
//        public void moveCursorLeft() {
//            if(cursor > 0) {
//                cursor-=1;
//            }
//        }
//
//        public void moveCursorRight() {
//            if(data.size()-1 == cursor) {
//                return;
//            } else {
//                cursor +=1;
//            }
//        }
//
//        public void remove() {
//            if(cursor == 0) {
//                return;
//            } else {
//                data.remove(cursor-1);
//                cursor-=1;
//            }
//        }
//
//        public void addData(char x) {
//            if(cursor == 0) {
//                data.add(0, x);
//            } else {
//                data.add(cursor, x);
//                cursor+=1;
//            }
//        }
//
//        public String getWord(){
//            StringBuilder str = new StringBuilder();
//            for(char x : data) {
//                str.append(x);
//            }
//            return str.toString();
//        }
//    }
}
