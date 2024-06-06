import java.util.Scanner;

public class p4101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while(true) {
            String[] input = sc.nextLine().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);

            if(A == 0 && B == 0) {
                break;
            }

            if(A > B) {
                sb.append("Yes").append("\n");
            } else {
                sb.append("No").append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}
