import java.util.Scanner;

public class p1463 {
    private static int INF = 999999999;
    public static int solved(int N) {
        if(N==1)
            return 0;
        if(N <= 3)
            return 1;

        int[] arr = new int[N+1];

        for(int i = 0; i <= N; i++) {
            arr[i] = INF;
        }

        arr[N] = 0;

        for(int i = N; i > 0; i--) {
            for(int j = 0; j < 3; j++) {
                if(j == 0) {
                    if(i % 3 ==0) {
                        arr[i/3] = Math.min(arr[i/3], arr[i]+1);
                    }
                }
                else if(j == 1) {
                    if(i%2 == 0) {
                        arr[i/2] = Math.min(arr[i/2], arr[i]+1);
                    }
                } else {
                    arr[i-1] =Math.min(arr[i-1], arr[i]+1);
                }
            }
        }

        return arr[1];
    }

    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        System.out.println(solved(N));
    }
}
