import java.util.Scanner;

public class p10871 {
    public static void main(String[] args) {
        int N, X;
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(input[0]);
        X = Integer.parseInt(input[1]);

        for(int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if(X > num) {
                sb.append(num).append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}
