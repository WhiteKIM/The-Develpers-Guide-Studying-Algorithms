import java.util.Scanner;

public class p1904 {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        int[] data = new int[N+1];
        if(N==1) {
            System.out.println(1);
            return;
        }
        if(N == 2) {
            System.out.println(2);
            return;
        }

        data[1] = 1;
        data[2] = 2;

        for(int i = 3; i <= N; i++) {
            data[i] = (data[i-2] + data[i-1])%15746;
        }
        System.out.println(data[N]);
    }
}
