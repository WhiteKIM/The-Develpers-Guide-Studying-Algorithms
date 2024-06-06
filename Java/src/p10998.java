import java.util.Scanner;

public class p10998 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);

        int result = A * B;
        System.out.println(result);
    }
}
