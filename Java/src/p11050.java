import java.util.Scanner;

// Do it 알고리즘 java
public class p11050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] dp = new int[N+1][N+1];
        dp[0][0] = 1;
        for(int i = 1; i <= N; i++) {
            for(int j = 0; j <= N; j++) {
                if(j == 0) {
                    dp[i][j] = 1;
                } else if(i == j) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
                }
            }
        }

        System.out.println(dp[N][M]);
    }
}
