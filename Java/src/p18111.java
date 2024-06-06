import java.util.Scanner;

public class p18111 {
    public static void main(String[] args) {
        int N, M, B;
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        B = Integer.parseInt(input[2]);

        int[][] map = new int[N][M];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < N; i++) {
            input = sc.nextLine().split(" ");
            for(int j = 0; j < M; j++) {
                int num = Integer.parseInt(input[j]);
                map[i][j] = num;
                min = Math.min(min, num);
                max = Math.max(max, num);
            }
        }


    }
}
