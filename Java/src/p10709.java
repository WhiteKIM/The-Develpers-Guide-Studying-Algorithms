import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class p10709 {
    public static void cloudMove(int[][] result, char[][] cloud, int N) {
        for(int i = 0; i < cloud[N].length; i++) {
            if(cloud[N][i] == 'c') {
                result[N][i] = 0;
            }
        }

        int count = 1;
        boolean check = false;
        for(int i = 0; i < cloud[N].length; i++) {
            if(result[N][i] == 0) {
                count = 1;
                check = true;
            } else if(check){
                result[N][i] = count++;
            }
        }
    }
    public static void main(String[] args) {
        int N, M;
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] split_input = input.split(" ");
        N = Integer.parseInt(split_input[0]);
        M = Integer.parseInt(split_input[1]);
        int[][] result = new int[N][M];
        char[][] data = new char[N][M];
        for(int i = 0; i < N; i++)
            Arrays.fill(result[i], -1);

        for(int i = 0; i < N; i++) {
            char[] input_cloud = sc.nextLine().toCharArray();
            for(int j = 0; j < M; j++) {
                data[i][j] = input_cloud[j];
            }
        }

        for(int i = 0; i < N; i++) {
            cloudMove(result, data, i);
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
