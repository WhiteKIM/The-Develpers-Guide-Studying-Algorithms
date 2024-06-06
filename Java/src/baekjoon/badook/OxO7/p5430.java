package baekjoon.badook.OxO7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class p5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            char[] command = br.readLine().toCharArray();
            int size = Integer.parseInt(br.readLine());
            String input = br.readLine();
            String[] data = input.replace("[","")
                    .replace("]","")
                    .split(",");

            LinkedList<Integer> deck = new LinkedList<>();
            for(int j = 0; j < size; j++) {
                deck.add(Integer.parseInt(data[j]));
            }

            boolean dir = true;
            boolean check = true;
            for(char c : command) {
                if(c == 'R') {
                    dir = !dir;
                } else {
                    if(dir) {
                        if(deck.isEmpty()) {
                            sb.append("error").append("\n");
                            check = false;
                            break;
                        } else {
                            deck.pollFirst();
                        }
                    } else {
                        if(deck.isEmpty()) {
                            sb.append("error").append("\n");
                            check = false;
                            break;
                        } else {
                            deck.pollLast();
                        }
                    }
                }
            }

            if(check) {
                if(dir) {
                    sb.append("[");
                    while (!deck.isEmpty()) {
                        sb.append(deck.pollFirst());
                        if(!deck.isEmpty())
                            sb.append(",");
                    }
                    sb.append("]").append("\n");
                } else {
                    sb.append("[");
                    while (!deck.isEmpty()) {
                        sb.append(deck.pollLast());
                        if(!deck.isEmpty())
                            sb.append(",");
                    }

                    sb.append("]").append("\n");
                }
            }
        }
        System.out.println(sb.toString());
    }
}
