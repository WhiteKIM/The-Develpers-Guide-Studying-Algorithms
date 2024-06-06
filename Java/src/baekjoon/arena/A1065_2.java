package baekjoon.arena;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A1065_2 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static boolean check(String[] data) {
        for(int i = 0; i < data.length; i++) {
            String s1 = data[i];
            for(int j = 0; j < i; j++) {
                String s2 = data[j];
                if(s1.equals(s2)) {
                    return false;
                }
            }
        }
        for(int i = 0; i < data.length-1; i++) {
            String s1 = data[i];
            String s2 = data[i+1];
            if(s1.charAt(s1.length()-1) != s2.charAt(0)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        int N;
        int M;

        N = Integer.parseInt(br.readLine());
        String[] input = new String[N];
        for(int i = 0; i < N; i++) {
            String str = br.readLine();
            input[i]= str;
        }

        M = Integer.parseInt(br.readLine());

        int index = 0;
        for(int i = 0; i < input.length; i++) {
            if(input[i].equals("?")){
                index = i;
                break;
            }
        }
        for(int i = 0; i < M; i++) {
            String str = br.readLine();
            input[index] = str;
            if(check(input)) {
                System.out.println(input[index]);
            }
        }
    }
}
