import java.util.Scanner;

public class p30030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int tax = N / 11;
        int result = N - tax;
        System.out.println(result);
    }
}
