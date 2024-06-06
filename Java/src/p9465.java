import java.util.Scanner;

public class p9465 {
    public static int solved(int[][] data, int N) {
        int[][] result = new int[2][N+1];
        result[0][1] = data[0][1];
        result[1][1] = data[1][1];

        for(int i = 2; i <= N; i++) {
            result[0][i] = Math.max(result[1][i - 1], result[1][i - 2]) + data[0][i];
            result[1][i] = Math.max(result[0][i - 1], result[0][i - 2]) + data[1][i];
        }

        return Math.max(result[0][data[0].length-1], result[1][data[0].length-1]);
    }

    public static void main(String[] args) {
        int T;
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        T = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < T; i++) {
            int N;
            N = Integer.parseInt(sc.nextLine());
            int[][] data = new int[2][N+1];
            for(int j = 0; j < 2; j++) {
                String[] input = sc.nextLine().split(" ");
                for(int k = 0; k < input.length; k++) {
                    data[j][k+1] = Integer.parseInt(input[k]);
                }
            }
            sb.append(solved(data, N)).append("\n");
        }
        System.out.println(sb.toString());
    }
}
