import java.util.Arrays;
import java.util.Scanner;

public class p2805 {

    public static boolean cutTree(int[] data ,int M, int height) {
        int result = 0;

        for(int i = 0; i < data.length; i++) {
            if(data[i] >= height) {
                result+= (data[i] - height);
            }

            if(result >= M)//잘라낸 나무의 값이 M보다 크거나 같으면 범위
                return true;
        }

        return false;//잘라낸 나무의 값이 M보다 작으면 절단기가 너무 큰 경우
    }

    public static int solved(int[] data, int M) {
        int left = 1;
        int right = 1000000000;
        int result = 0;
        while (left <= right) {
            int mid = (left + right)/2;

            if(cutTree(data, M, mid)) {//절단기의 범위 확인후 범위 내인 경우
                   result = mid;
                   left = mid + 1;
            } else {//절단기가 너무 큰 경우, 절단기를 줄여야 함
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int N, M;
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        int[] data = new int[N];
        input = sc.nextLine().split(" ");
        for(int i = 0; i < N; i++) {
            data[i] = Integer.parseInt(input[i]);
        }

        System.out.println(solved(data, M));
    }
}
