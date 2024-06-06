import java.util.Scanner;

public class p5585 {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int exchange = 1000 - N;
        int data[] = {500, 100, 50, 10, 5, 1};
        int count = 0;

        for(int x : data) {
            count += exchange / x;//동전개수
            exchange = exchange % x;//거스르고 남은 돈
        }
        System.out.println(count);
    }
}
