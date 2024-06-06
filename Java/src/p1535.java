import java.util.Scanner;

public class p1535 {
    private static final int health = 100;
    public static int[][] happiness;

    private static int solved(int[] loss, int[] happy, int N) {
        for(int i = 1; i <= N; i++) {
            for (int j = 1; j < health; j++) {
                if(loss[i] <= j) {
                    happiness[i][j] = Math.max(happy[i]+happiness[i-1][j - loss[i]], happiness[i-1][j]);
                } else {
                    happiness[i][j] = happiness[i-1][j];
                }
            }
        }

        return happiness[N][health-1];
    }

    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());

        happiness = new int[N+1][health];
        String[] input_lose = sc.nextLine().split(" ");
        String[] input_happy = sc.nextLine().split(" ");
        int[] loss = new int[N+1];
        int[] happy = new int[N+1];
        for(int i = 1; i <= N; i++) {
            loss[i] = Integer.parseInt(input_lose[i-1]);
            happy[i] = Integer.parseInt(input_happy[i-1]);
        }

        int result = solved(loss, happy, N);
        System.out.println(result);
    }
}
