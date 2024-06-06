import java.util.Scanner;

public class p13305 {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());
        int[] city = new int[N-1];
        int[] price = new int[N];
        long sum = 0;

        String[] input = sc.nextLine().split(" ");
        for(int i = 0; i < input.length; i++) {
            city[i] = Integer.parseInt(input[i]);
        }

        input = sc.nextLine().split(" ");
        for(int i = 0; i < input.length; i++) {
            price[i] = Integer.parseInt(input[i]);
        }

        long min = price[0];
        for(int i = 0; i < N-1; i++) {
            if(price[i] < min)
                min = price[i];

            sum += min * city[i];
        }

        System.out.println(sum);
    }
}
