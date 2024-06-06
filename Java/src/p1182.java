import java.util.Scanner;

public class p1182 {
    public static int N;
    public static int S;
    public static int count = 0;

    public static void solved(int[] data, int index, int sum) {
        if(index >= N) {
            return;
        }

        sum += data[index];

        if(sum == S) {
            count++;
        }

        solved(data, index+1, sum);// 현재 연산 결과를 선택하는 경우
        solved(data, index+1, sum-data[index]);// 현재 연산 결과를 반영하지 않은 경우
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        N = Integer.parseInt(input[0]);
        S = Integer.parseInt(input[1]);

        input = sc.nextLine().split(" ");
        int[] data = new int[N];
        for(int i = 0; i < N; i++) {
            data[i] = Integer.parseInt(input[i]);
        }
        solved(data, 0, 0);
        System.out.println(count);
    }
}
