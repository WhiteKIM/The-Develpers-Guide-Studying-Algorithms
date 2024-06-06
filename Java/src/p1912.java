import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class p1912 {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());
        String[] input = sc.nextLine().split(" ");

        int[] data = new int[N];
        int[] result = new int[N];

        for(int i = 0; i < input.length; i++) {
            int num = Integer.parseInt(input[i]);
            data[i] = num;
        }
        int max = -999999;
        result[0] = data[0];
        for(int i = 1; i < N; i++) {
            result[i] = Math.max(result[i-1]+data[i], data[i]);
        }
        // result[i]는 i까지의 최대값
        // 따라서 이전 최대값에 값을 더한것과 현재 값을 비교

        for(int x : result)
            max = Math.max(x, max);

        System.out.println(max);
    }
}
