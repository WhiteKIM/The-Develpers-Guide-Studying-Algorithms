import java.util.ArrayList;
import java.util.Scanner;

public class p2775 {
    public static ArrayList<Integer> result = new ArrayList<>();
    public static int neighMeet(int k, int n) {
        int[][] arr = new int[k+1][n+1];
        for(int i = 1; i <= n; i++) {
            arr[0][i] = i;//0층의 N번째 호실에는 N명이 살고 있다.
        }

        for(int i = 1; i < k+1; i++) {
            for(int j = 1; j < n+1; j++) {
                for(int x = 1; x <= j; x++) {
                    arr[i][j] += arr[i-1][x]; // X호실의 N호실의 사람은 X-1층의 0 ~ N호실까지의 사람의 합
                }
            }
        }
        return arr[k][n];
    }

    public static void main(String[] args) {
        int T, k, n;
        Scanner sc = new Scanner(System.in);

        T = sc.nextInt();
        for(int i = 0; i < T; i++) {
            k = sc.nextInt();
            n = sc.nextInt();
            result.add(neighMeet(k, n));
        }

        for(int x : result) {
            System.out.println(x);
        }
    }
}
