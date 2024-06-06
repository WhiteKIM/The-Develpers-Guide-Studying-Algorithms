import java.util.Scanner;

public class p11720 {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());
        int sum = 0;
        String input = sc.nextLine();
        for(int i = 0; i < N; i++) {
            sum+= Character.getNumericValue(input.charAt(i));
        }
        System.out.println(sum);
    }
}
