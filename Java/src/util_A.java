import java.util.Scanner;

public class util_A {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());
        String[] input = sc.nextLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(input[i]);

            if(num == 300) {
                sb.append(1).append(" ");
            } else if(275 <= num && num < 300) {
                sb.append(2).append(" ");
            } else if(250<= num && num < 275) {
                sb.append(3).append(" ");
            } else {
                sb.append(4).append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}
