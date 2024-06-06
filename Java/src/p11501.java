import java.util.Scanner;

public class p11501 {
    public static long stock(int[] date, int N) {
        int max = 0;
        long result = 0;

        for (int i = N -1; i >= 0; i--) {//상한가가 앞쪽에서 나오면 그만큼 팔아야 되는 순간이 빨리오거나 구매안함
            if(max > date[i]) {
                result += max - date[i]; // 주식 상한가보다 낮으면 무조건 구매
            } else if(max < date[i]) {
                max = date[i];// 상한가를 찾는 중
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int T;
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        T = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < T; i++) {
            int N = Integer.parseInt(sc.nextLine());
            String[] input = sc.nextLine().split(" ");
            int[] date = new int[N];

            for(int j = 0; j < N; j++) {
                date[j] = Integer.parseInt(input[j]);
            }
            sb.append(stock(date, N)).append("\n");
        }

        System.out.println(sb.toString());
    }
}
