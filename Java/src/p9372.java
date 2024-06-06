import java.util.ArrayList;
import java.util.Scanner;

/**
 * 결과론적으로 N개의 점이 있을 때 모든 점을 방문하는 경로는 N-1개이다.
 */
public class p9372 {
    public static void main(String[] args) {
        int T;
        Scanner sc = new Scanner(System.in);
        T = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < T; i++) {
            int N, M;
            String input = sc.nextLine();
            String[] temp = input.split(" ");

            N = Integer.parseInt(temp[0]);
            M = Integer.parseInt(temp[1]);
            for(int j = 0; j < M; j++) {
                int x, y;
                String input1 = sc.nextLine();
                String[] temp1 = input1.split(" ");
                x = Integer.parseInt(temp1[0]);
                y = Integer.parseInt(temp1[1]);
            }
            result.add(N-1);
        }

        for(int x : result) {
            System.out.println(x);
        }
    }
}
