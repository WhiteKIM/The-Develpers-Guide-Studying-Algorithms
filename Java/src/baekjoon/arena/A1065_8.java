package baekjoon.arena;

import java.io.*;

public class A1065_8 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int N, M, K;
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        K = Integer.parseInt(input[2]);
        StringBuilder sb = new StringBuilder();
        int[] column = new int[N];
        int[] row = new int[M];
        for(int i = 0; i < K; i++) { // K 최대 50만,
            input = br.readLine().split(" ");
            int n1 = Integer.parseInt(input[0]);
            int n2 = Integer.parseInt(input[1]);
            int n3 = Integer.parseInt(input[2]);

            if(n1 == 1) {
                int num = n2 - 1;
                column[num]+=n3;
            } else {
                int num = n2 -1 ;
                row[num] += n3;
            }
        }

        for(int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sb.append(column[i]+row[j]).append(" ");
            }
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}

// #1 - 2 2 1
// 0 1 0
// 0 1 0

// #2  - 1 2 2
// 0 1 0
// 2 3 2

// #3 - 2 3 -3
// 0 1 -3
// 2 3 -1