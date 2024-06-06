import java.util.Scanner;

public class p2839 {
    public static int solved(int N) {
        int count = 0;
        while(N > 2) {
            if(N % 5 == 0) {
                count += N/5;
                return count;
            }
            N = N-3;
            count++;

            if(N < 3 && N != 0) {
                return -1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int N;
        int count = 0;
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        System.out.println(solved(N));
    }
}
