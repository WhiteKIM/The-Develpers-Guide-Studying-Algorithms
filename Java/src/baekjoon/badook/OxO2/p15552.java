package baekjoon.badook.OxO2;

import java.io.*;

public class p15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            bw.write(String.valueOf(A+B));
            bw.write("\n");
        }

        bw.flush();
    }
}
