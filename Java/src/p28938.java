import java.util.Scanner;

public class p28938 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String[] input = sc.nextLine().split(" ");
        int sum = 0;
        for(int i = 0; i < N; i++) {
            sum += Integer.parseInt(input[i]);
        }

        if(sum > 0) {
            System.out.println("Right");
        } else if(sum < 0) {
            System.out.println("Left");
        } else {
            System.out.println("Stay");
        }
    }
}
