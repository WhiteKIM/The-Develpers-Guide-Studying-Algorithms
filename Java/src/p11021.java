import java.util.Scanner;

public class p11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= N; i++) {
            String[] input = sc.nextLine().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            String str = "Case #"+i+": "+(A+B);
            sb.append(str).append("\n");
        }

        System.out.println(sb.toString());
    }
}
