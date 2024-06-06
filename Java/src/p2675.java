import java.util.Scanner;

public class p2675 {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            String[] input = sc.nextLine().split(" ");
            int R = Integer.parseInt(input[0]);
            String str = input[1];

            for(int j = 0; j < str.length(); j++) {
                for(int k = 0; k < R; k++) {
                    sb.append(str.charAt(j));
                }
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
