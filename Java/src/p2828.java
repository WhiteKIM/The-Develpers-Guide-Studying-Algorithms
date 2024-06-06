import java.util.Scanner;

public class p2828 {
    public static void main(String[] args) {
        int N, M;
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        int J = Integer.parseInt(sc.nextLine());
        int left = 1;
        int right = M;
        int move = 0;
        for(int i = 0; i < J; i++) {
            int apple = Integer.parseInt(sc.nextLine());

            if(left <= apple && apple <= right) {
                continue;
            } else if (apple < left) {
                int num = left - apple;
                left -= num;
                move+=num;
                right-=num;
            } else if(apple > right) {
                int num = apple - right;
                move+= num;
                left += num;
                right += num;
            }
        }

        System.out.println(move);
    }
}
