import java.util.Scanner;

public class p11055 {

    public static int solved(int[] data, int N) {
        int[] result = new int[N];

        for(int i = 0; i < N; i++) {
            result[i] = data[i];//값 초기세팅
        }
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < i; j++) {
                if(data[j] < data[i] && (result[i] < result[j]+data[i])) {
                    result[i] = result[j]+data[i];
                }
            }
        }
        int maxnum = 0;
        for(int x : result) {
            maxnum = Math.max(x, maxnum);
        }
        return maxnum;
    }

    public static void main(String[] args) {
        int T;
        Scanner sc = new Scanner(System.in);

        T = Integer.parseInt(sc.nextLine());
        int[] data = new int[T];
        String[] input = sc.nextLine().split(" ");
        for(int i = 0; i < T; i++) {
            data[i] = Integer.parseInt(input[i]);
        }

        int result = solved(data, T);
        System.out.println(result);
    }
}
