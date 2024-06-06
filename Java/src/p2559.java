import java.util.Scanner;

public class p2559 {

    public static int solved(int[] data, int M) {
        int[] sum = new int[data.length+1];
        int max = - 9999999;

        for(int j = 1; j <= data.length; j++) {
            sum[j] = sum[j-1]+data[j-1];
        }

        for(int i = 0; i <= data.length-M; i++) {
            max = Math.max(sum[i+M] - sum[i], max);
        }

        return max;
    }

    public static void main(String[] args) {
        int N, M;
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        int[] data = new int[N];

        input = sc.nextLine().split(" ");
        for(int i = 0; i < input.length; i++) {
            data[i] = Integer.parseInt(input[i]);
        }
        System.out.println(solved(data, M));
    }
}
