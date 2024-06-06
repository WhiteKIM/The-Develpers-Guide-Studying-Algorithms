package baekjoon.arena;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1065_6 {

    public static String solved(char[] data) {
        int black = 0;
        int white = 0;

        for(int i = data.length-1; i >= 0; i--) {
            for(int j = i-1; j >= 0; j--) {
                if(data[i]==data[j]) {
                    if(data[i]=='W') {
                        white++;
                    } else if (data[i]=='B') {
                        black++;
                    }
                } else if(data[j]=='.') {
                    if(data[i]=='W') {
                        data[j] = 'W';
                        white++;
                    } else if (data[i]=='B') {
                        data[j]='B';
                        black++;
                    }
                } else {
                    break;
                }
            }
        }
        System.out.println("black : "+black);
        System.out.println("white : "+white);

        if(black == white) {
            if(data[data.length-1]=='B')
                return "BLACK";
            else
                return "WHITE";
        }

        if(black > white) {
            return "BLACK";
        } else {
            return "WHITE";
        }
    }
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int N;
        N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            char[] data = br.readLine().toCharArray();
            sb.append(solved(data)).append("\n");
        }
        System.out.println(sb.toString());
    }
}
