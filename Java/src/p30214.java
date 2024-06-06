import java.util.Scanner;

public class p30214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);

        if(((double) B/2) <= A) {
            System.out.println("E");
        } else {
            System.out.println("H");
        }
    }
}
