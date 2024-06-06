import java.util.Scanner;

public class p10952 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            String[] input = sc.nextLine().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            if(A== 0 && B == 0) {
                break;
            }

            int result = A + B;
            sb.append(result).append("\n");
        }
        System.out.println(sb.toString());
    }
}
