import java.util.Scanner;

public class p27959 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int coin = Integer.parseInt(input[0]);
        int money = Integer.parseInt(input[1]);

        if((coin * 100) > money) {
            System.out.println("Yes");
        } else if((coin * 100) < money){
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
