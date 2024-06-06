import java.util.Scanner;

public class p10844 {
    public static int mod = 1000000000;

    public static int solved(int N) {
        int[][] result = new int[N+1][10];
        for(int i = 1; i < 10; i++) {
            result[1][i] = 1;
        }
        for(int i = 2; i <= N; i++) {
            for(int j = 0; j < 10; j++) {
                if(j == 0) {
                    result[i][j] = result[i-1][j+1];
                } else if(j == 9) {
                    result[i][j] = result[i-1][j-1];
                } else {
                    result[i][j] = result[i-1][j-1] + result[i-1][j+1];
                }
                result[i][j] %= mod;
            }
        }
        int sum = 0;
        for(int i = 0; i < 10; i++) {
            sum = (sum+ result[N][i])%mod;
        }
        return sum;
    }

    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        System.out.println(solved(N));
    }
}
