import java.util.Scanner;

public class exchange_greedy {
    private static int data[] = {5, 2};

    public static int exchange(int money) {
        int count = 0;
        int exchange = 0;

        int num = money/data[0];
        count = 0;
        exchange = money % data[0];

        if(exchange % data[1] == 0) {
            count += num + exchange/data[1];
            return count;
        }
        for(int i = num; i >= 0; --i) {
            if(i < 0) {
                count--;
                break;
            }
            exchange = money - data[0]*i;
            if(exchange % data[1] == 0)
            {
                count += exchange / data[i];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int result = exchange(N);
        System.out.println(result);
    }
}
