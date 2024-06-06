import java.util.Scanner;

public class p30007 {

    public static int water(int A, int B, int X) {
        return A*(X-1)+B;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            String[] input = sc.nextLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int x = Integer.parseInt(input[2]);
            sb.append(water(a, b, x)).append("\n");
        }

        System.out.println(sb.toString());
    }
}
