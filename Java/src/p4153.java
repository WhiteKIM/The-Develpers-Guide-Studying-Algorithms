import java.util.Scanner;

public class p4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while(true) {
            String[] input = sc.nextLine().split(" ");
            int A, B, C;
            A = Integer.parseInt(input[0]);
            B = Integer.parseInt(input[1]);
            C = Integer.parseInt(input[2]);

            if(A == 0 && B == 0 && C == 0) {
                break;
            }

            if(A > C) {
                int temp = C;
                C = A;
                A = temp;
            }

            if(B > C) {
                int temp = C;
                C = B;
                B = temp;
            }

            if(Math.pow(C, 2) == Math.pow(A,2)+Math.pow(B, 2)) {
                sb.append("right").append("\n");
            } else {
                sb.append("wrong").append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}
