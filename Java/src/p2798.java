import java.util.Scanner;

public class p2798 {
    public static void main(String[] args) {
        int N, M;
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");

        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        input = sc.nextLine().split(" ");
        int[] data = new int[N];

        for(int i = 0; i < N; i++) {
            data[i] = Integer.parseInt(input[i]);
        }

        int max = 0;
        for(int i = 0; i < N; i++) {
            for(int j = i+1; j < N; j++) {
                for(int k = j+1; k < N; k++) {
                    int sum = data[i]+data[j]+data[k];

                    if(sum <= M) {
                        max = Math.max(sum, max);
                    }
                }
            }
        }

        System.out.println(max);
    }
}
