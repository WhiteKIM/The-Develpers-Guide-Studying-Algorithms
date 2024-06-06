package baekjoon.badook.OxO4;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class p5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            char[] input = br.readLine().toCharArray();
            List<Character> data = new LinkedList<>();
            ListIterator<Character> iter = data.listIterator();

            for(char c : input) {
                if(c == '>') {
                    if(iter.hasNext())
                        iter.next();
                } else if(c == '<') {
                    if(iter.hasPrevious())
                        iter.previous();
                } else if(c == '-') {
                    if(iter.hasPrevious()) {
                        iter.previous();
                        iter.remove();
                    }
                } else {
                    iter.add(c);
                }
            }

            StringBuilder result = new StringBuilder();
            for(char c : data)
                result.append(c);

            System.out.println(result);
        }
    }
}
