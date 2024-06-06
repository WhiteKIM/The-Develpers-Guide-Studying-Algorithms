import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class p1205 {

    public static int solved(Integer[] data, int point, int count) {
        int rank = 1;//순위를 비교

        if(data.length == count && point <= data[data.length-1]) {//가장 작은값보다도 작다면 순위권 밖이다.
            return -1;
        } else {
            for(int i = 0; i < data.length; i++) {
                if(point < data[i])
                    rank++;
            }
        }
        return rank;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int point = Integer.parseInt(input[1]);
        int compare = Integer.parseInt(input[2]);

        if (N == 0) {
            System.out.println(1);
        } else {
            Integer[] rankData = new Integer[N];
            input = sc.nextLine().split(" ");
            for (int i = 0; i < N; i++) {
                rankData[i] = Integer.parseInt(input[i]);
            }

            Arrays.sort(rankData, Collections.reverseOrder());
            System.out.println(solved(rankData, point, compare));
        }
    }
}
