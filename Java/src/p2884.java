import java.util.Scanner;

public class p2884 {
    public static void main(String[] args) {
        int H, M;
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        H = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        int fortyFive = 45;

        if(M < 45) {
            if(H == 0) {
                H = 23;
            } else {
                H -= 1;
            }
            M += 15;
        } else {
            M -= 45;
        }

        System.out.println(H+" "+M);
    }
}
