import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class p1911 {

    public static void main(String[] args) {
        int N, M;
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        int[][] data = new int[N][2];

        for(int i = 0; i < N; i++) {
            int num1, num2;
            input = sc.nextLine().split(" ");
            num1 = Integer.parseInt(input[0]);
            num2 = Integer.parseInt(input[1]);

            data[i][0] = num1;
            data[i][1] = num2;
        }

        Arrays.sort(data, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        int count = 0;
        int cover = 0;
        for(int i = 0; i < N; i++) {
            if(data[i][0] > cover)
                cover = data[i][0];

            if(data[i][1] >=  cover) {
                while (data[i][1] > cover) {
                    count++;
                    cover += M;
                }
            }
        }
        System.out.println(count);
    }
}
